package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.WebsiteAboutI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteBlogI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteBookingRoomI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteContactI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteFooterI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteHomeI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteMenuI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteRoomI18nRepository;
import com.dev.delta.i18n.repositories.WebsiteSignInI18nRepository;

@Service
public class WebsiteDTO implements DTO {

	@Autowired
	WebsiteMenuI18nRepository websiteMenuI18nRepository;
	
	@Autowired
	WebsiteFooterI18nRepository  websiteFooterI18nRepository;
	
	@Autowired
	WebsiteContactI18nRepository  websiteContactI18nRepository;
	
	@Autowired
	WebsiteHomeI18nRepository  websiteHomeI18nRepository;
	
	@Autowired
	WebsiteSignInI18nRepository  websiteSignInI18nRepository;
	
	@Autowired
	WebsiteAboutI18nRepository  websiteAboutI18nRepository;
	
	@Autowired
	WebsiteRoomI18nRepository   websiteRoomI18nRepository;
	
	@Autowired
	WebsiteBlogI18nRepository   websiteBlogI18nRepository;
	
	@Autowired
	WebsiteBookingRoomI18nRepository     websiteBookingRoomI18nRepository   ;
	
	
	
	
	@Override
	public void populate() {
  
         insertMenu();
         insertHomePage();
         insertAboutPage();
         insertBlogPage();
         insertContactPage();
         insertFooterPage();
         insertRoomPage();
         insertSignInPage();
         insertBookingRoomPage();
     		
	}

	private void insertBookingRoomPage() {
		
		
		websitebookingRoomI18n.setBookI18n("book");
		websitebookingRoomI18n.setBookingI18n("Booking");
		websitebookingRoomI18n.setBookTitleI18n("Booking Room");
		websitebookingRoomI18n.setChoosepaymentI18n("Choose payment method");
		websitebookingRoomI18n.setConfirmBookingI18n("Confirm booking");
		websitebookingRoomI18n.setDetailsI18n("Details");
		websitebookingRoomI18n.setPaymentI18n("Payment");
		websitebookingRoomI18n.setPaynowI18n("Pay NOW");
		websitebookingRoomI18n.setPrintI18n("Print");
		websitebookingRoomI18n.setSaveI18n("Save");
		websitebookingRoomI18n.setSummaryI18n("Summary");
		websitebookingRoomI18n.setLangI18n("EN");
		websitebookingRoomI18n.setContactdetailsI18n("Contact Details");
		websitebookingRoomI18n.setBookingdetailsI18n("Booking Details");
		websitebookingRoomI18n.setInvoiceI18n("Sale Invoice");
		websiteBookingRoomI18nRepository.save(websitebookingRoomI18n);
		
		websitebookingRoomI18n2.setBookI18n("حجز");
		websitebookingRoomI18n2.setBookingI18n("حجز");
		websitebookingRoomI18n2.setBookTitleI18n("غرفة الحجز");
		websitebookingRoomI18n2.setChoosepaymentI18n("اختر وسيلة الدفع");
		websitebookingRoomI18n2.setConfirmBookingI18n("تأكيد الحجز");
		websitebookingRoomI18n2.setDetailsI18n("تفاصيل");
		websitebookingRoomI18n2.setPaymentI18n("دفع");
		websitebookingRoomI18n2.setPaynowI18n("ادفع الآن");
		websitebookingRoomI18n2.setPrintI18n("طباعة");
		websitebookingRoomI18n2.setSaveI18n("حفظ");
		websitebookingRoomI18n2.setSummaryI18n("ملخص");
		websitebookingRoomI18n2.setContactdetailsI18n("بيانات المتصل");
		websitebookingRoomI18n2.setBookingdetailsI18n("تفاصيل الحجز");
		websitebookingRoomI18n2.setInvoiceI18n("فاتورة");
		websitebookingRoomI18n2.setLangI18n("AR");
		websiteBookingRoomI18nRepository.save(websitebookingRoomI18n2);
		
		
		
		
	}

	private void insertSignInPage() {
		websiteSignInI18n.setAdminI18n("Username");
		websiteSignInI18n.setLoginI18n("Sign In ");
		websiteSignInI18n.setPageTitleI18n("Sign In");
		websiteSignInI18n.setPasswordI18n("Password");
		websiteSignInI18n.setWebsiteI18n("Website");
		websiteSignInI18n.setLang("EN");
		
		websiteSignInI18n2.setAdminI18n("اسم المستخدم");
		websiteSignInI18n2.setLoginI18n("تسجيل الدخول");
		websiteSignInI18n2.setPageTitleI18n("تسجيل الدخول");
		websiteSignInI18n2.setPasswordI18n("كلمه السر");
		websiteSignInI18n2.setWebsiteI18n("موقع ويب");
		websiteSignInI18n2.setLang("AR");
		
		websiteSignInI18nRepository.save(websiteSignInI18n);
		websiteSignInI18nRepository.save(websiteSignInI18n2);
		
		
		
	}

	private void insertRoomPage() {
		websiteRoomI18n.setPageTitleI18n("Rooms");
		websiteRoomI18n.setReservationSectionI18n("For Reservation 0r Query?");
		websiteRoomI18n.setRoomSubTitleI18n("Choose a Better Room");
		websiteRoomI18n.setRoomTitleI18n("Featured Rooms");
		websiteRoomI18n.setLang("EN");
		
		websiteRoomI18n2.setPageTitleI18n("غرف");
		websiteRoomI18n2.setReservationSectionI18n("للحجز أو الاستعلام؟");
		websiteRoomI18n2.setRoomSubTitleI18n("اختر غرفة أفضل");
		websiteRoomI18n2.setRoomTitleI18n("غرف مميزة");
		websiteRoomI18n2.setLang("AR");
		
		websiteRoomI18nRepository.save(websiteRoomI18n);
		websiteRoomI18nRepository.save(websiteRoomI18n2);
		
	}

	private void insertFooterPage() {
		websiteFooterI18n.setAddressTitleI18n("Address");
		websiteFooterI18n.setNavigationTitleI18n("Navigation");
		websiteFooterI18n.setNewsletterSubTitleI18n("Subscribe newsletter to get updates");
		websiteFooterI18n.setNewsletterTitleI18n("Newsletter");
		websiteFooterI18n.setReservationTitleI18n("Revervation");
		websiteFooterI18n.setSignUpButton("Sign Up");
		websiteFooterI18n.setEmail("Email");
		websiteFooterI18n.setLang("EN");
		
		
		websiteFooterI18n2.setAddressTitleI18n("عنوان");
		websiteFooterI18n2.setNavigationTitleI18n("التنقل");
		websiteFooterI18n2.setNewsletterSubTitleI18n("اشترك في النشرة الإخبارية للحصول على التحديثات");
		websiteFooterI18n2.setNewsletterTitleI18n("النشرة");
		websiteFooterI18n2.setReservationTitleI18n("حجز");
		websiteFooterI18n2.setSignUpButton("اشتراك");
		websiteFooterI18n2.setEmail("بريد الالكتروني");
		websiteFooterI18n2.setLang("AR");
		
		websiteFooterI18nRepository.save(websiteFooterI18n);
		websiteFooterI18nRepository.save(websiteFooterI18n2);
		
	}

	private void insertContactPage() {
		websiteContactI18n.setEmailI18n("Email");
		websiteContactI18n.setEmailSubtitleI18n("Send us your query anytime");
		websiteContactI18n.setFormTitleI18n("Get in Touch");
		websiteContactI18n.setMessageI18n("Message");
		websiteContactI18n.setNameI18n("Name");
		websiteContactI18n.setPageTitleI18n("Get in Touch");
		websiteContactI18n.setPhoneSubtitleI18n("Mon to Fri 9am to 6pm");
		websiteContactI18n.setSendI18n("Send");
		websiteContactI18n.setSubjectI18n("Subject");
		websiteContactI18n.setLang("EN");
		
		websiteContactI18n2.setEmailI18n("بريد الالكتروني");
		websiteContactI18n2.setEmailSubtitleI18n("أرسل لنا استفسارك في أي وقت");
		websiteContactI18n2.setFormTitleI18n("ابقى على تواصل");
		websiteContactI18n2.setMessageI18n("رسالة");
		websiteContactI18n2.setNameI18n("اسم");
		websiteContactI18n2.setPageTitleI18n("أرسل لنا استفسارك في أي وقت");
		websiteContactI18n2.setPhoneSubtitleI18n("من الإثنين إلى الجمعة من الساعة 9 صباحًا حتى 6 مساءً");
		websiteContactI18n2.setSendI18n("يرسل");
		websiteContactI18n2.setSubjectI18n("الموضوع");
		websiteContactI18n2.setLang("AR");
		
		websiteContactI18nRepository.save(websiteContactI18n);
		websiteContactI18nRepository.save(websiteContactI18n2);
		
	}

	private void insertBlogPage() {
		// TODO Auto-generated method stub
		websiteBlogI18n.setCategoryTitleI18n("Category");
		websiteBlogI18n.setEmailI18n("Email");
		websiteBlogI18n.setInstagramFeedI18n("Instagram Feeds");
		websiteBlogI18n.setNameSearchI18n("Search");
		websiteBlogI18n.setNewsletterTitleI18n("Newsletter");
		websiteBlogI18n.setPageTitleI18n("blog");
		websiteBlogI18n.setRecentPostI18n("Recent Post");
		websiteBlogI18n.setSearchButtonI18n("Search");
		websiteBlogI18n.setSendButtonI18n("Subsrcribe");
		websiteBlogI18n.setTagI18n("Tag Clouds");
		websiteBlogI18n.setLang("EN");
		
		
		websiteBlogI18n2.setCategoryTitleI18n("فئة");
		websiteBlogI18n2.setEmailI18n("بريد الالكتروني");
		websiteBlogI18n2.setInstagramFeedI18n("انستغرام");
		websiteBlogI18n2.setNameSearchI18n("بحث");
		websiteBlogI18n2.setNewsletterTitleI18n("النشرة");
		websiteBlogI18n2.setPageTitleI18n("مقالات");
		websiteBlogI18n2.setRecentPostI18n("المنشور الاخير");
		websiteBlogI18n2.setSearchButtonI18n("بحث");
		websiteBlogI18n2.setSendButtonI18n("الإشتراك");
		websiteBlogI18n2.setTagI18n("علامة الغيوم");
		websiteBlogI18n2.setLang("AR");
		
		websiteBlogI18nRepository.save(websiteBlogI18n);
		websiteBlogI18nRepository.save(websiteBlogI18n2);
		
		
	}

	private void insertAboutPage() {
		websiteAboutI18n.setPageTitleI18n("About Us");
		websiteAboutI18n.setReservationSectionI18n("For Reservation 0r Query?");
		websiteAboutI18n.setLang("EN");
		
		
		websiteAboutI18n2.setPageTitleI18n("معلومات عنا");
		websiteAboutI18n2.setReservationSectionI18n("للحجز أو الاستعلام؟");
		websiteAboutI18n2.setLang("AR");
		
		websiteAboutI18nRepository.save(websiteAboutI18n);
		websiteAboutI18nRepository.save(websiteAboutI18n2);
		
	}

	private void insertHomePage() {
		websiteHomeI18n.setAboutSectionTitleI18n("About Us");
		websiteHomeI18n.setBookButtonI18n("Book now");
		websiteHomeI18n.setOfferSectionSubTitleI18n("Ongoing Offers");
		websiteHomeI18n.setOfferSectionTitleI18n("Our Offers");
		websiteHomeI18n.setReservationSectionI18n("For Reservation 0r Query?");
		websiteHomeI18n.setRoomSubTitleI18n("Choose a Better Room");
		websiteHomeI18n.setRoomTitleI18n("Featured Rooms");
		websiteHomeI18n.setVideoSubTitleI18n("Relax and Enjoy your Vacation ");
		websiteHomeI18n.setVideoTitleI18n("Hotel Reservation View");
		websiteHomeI18n.setLearnmoreButton("Learn more");
		websiteHomeI18n.setLang("EN");
		
		
		websiteHomeI18n2.setAboutSectionTitleI18n("معلومات عنا");
		websiteHomeI18n2.setBookButtonI18n("احجز الآن");
		websiteHomeI18n2.setOfferSectionSubTitleI18n("العروض الجارية");
		websiteHomeI18n2.setOfferSectionTitleI18n("عروضنا");
		websiteHomeI18n2.setReservationSectionI18n("للحجز أو الاستعلام؟");
		websiteHomeI18n2.setRoomSubTitleI18n("اختر غرفة أفضل ");
		websiteHomeI18n2.setRoomTitleI18n("غرف مميزة");
		websiteHomeI18n2.setVideoSubTitleI18n("استرخ واستمتع بإجازتك ");
		websiteHomeI18n2.setLearnmoreButton("أعرف أكثر");
		websiteHomeI18n2.setVideoTitleI18n("عرض حجز الفندق");
		websiteHomeI18n2.setLang("AR");
		
		websiteHomeI18nRepository.save(websiteHomeI18n);
		websiteHomeI18nRepository.save(websiteHomeI18n2);
		
		
	}

	private void insertMenu() {
		   websiteMenuI18n.setAboutItemI18n("About");
	         websiteMenuI18n.setBlogItemI18n("Blog");
	         websiteMenuI18n.setContactI18n("Contact");
	         websiteMenuI18n.setHomeItemI18n("Home");
	         websiteMenuI18n.setSignInI18n("Sign In");
	         websiteMenuI18n.setRoomItemI18n("Rooms");
	         websiteMenuI18n.setLang("EN");
	         
	         websiteMenu2I18n.setAboutItemI18n("حول");
	         websiteMenu2I18n.setBlogItemI18n("مقالات");
	         websiteMenu2I18n.setContactI18n("اتصال");
	         websiteMenu2I18n.setRoomItemI18n("غرف");
	         websiteMenu2I18n.setHomeItemI18n("الصفحة الرئيسية");
	         websiteMenu2I18n.setSignInI18n("تسجيل الدخول");
	         websiteMenu2I18n.setLang("AR");
	         
	         websiteMenuI18nRepository.save(websiteMenuI18n);
	 		websiteMenuI18nRepository.save(websiteMenu2I18n);
		
	}

}
