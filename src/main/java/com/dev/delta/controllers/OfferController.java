package com.dev.delta.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.dev.delta.entities.Amenity;
import com.dev.delta.entities.Blog;
import com.dev.delta.entities.Customer;
import com.dev.delta.entities.Offer;
import com.dev.delta.services.OfferService;
import com.dev.delta.util.DateBlogUtil;
import com.dev.delta.util.FileUploadUtil;

@Controller
public class OfferController {

	@Autowired
	private OfferService offerService;

	@GetMapping("/offersadmin")
	public String getOffersAdmin(Model model) {
		List<Offer> offers = offerService.getOffers();
		model.addAttribute("items", offers);

		return "offer/offers";
	}

	@GetMapping("/add-offer")
	public String getaddOffer(Model model) {
		return "offer/add";
	}

	@PostMapping("/addoffer")
	public RedirectView saveOffer(Offer offer, @RequestParam("images") MultipartFile multipartFile)
			throws IOException, ParseException {

		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		offer.setImage(fileName);
		offerService.save(offer);
		// String uploadDir = "src/main/resources/static/photos/" + savedBlog.getId();
		String uploadDir = "src/main/resources/static/photos/offer";
		FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

		return new RedirectView("/offersadmin", true);
	}
	
	
	@RequestMapping("/offer/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		Offer offer = offerService.findById(id);
		model.addAttribute("item", offer);
		return "offer/view";
	}
	
	
	@RequestMapping("/editoffer/{id}")
	public String findOfferById(@PathVariable("id") Long id, Model model) {
		Offer offer = offerService.findById(id);
		model.addAttribute("item", offer);
		return "offer/edit";
	}

}
