package com.foodly.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityAppNavigationBinding
import com.foodly.app.modules.accountsettings.ui.AccountSettingsActivity
import com.foodly.app.modules.addpaymentmethod.ui.AddPaymentMethodActivity
import com.foodly.app.modules.addsocialaccounts.ui.AddSocialAccountsActivity
import com.foodly.app.modules.addtoorder.ui.AddToOrderActivity
import com.foodly.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.foodly.app.modules.browsefoods.ui.BrowseFoodsActivity
import com.foodly.app.modules.cardlist.ui.CardListActivity
import com.foodly.app.modules.changepassword.ui.ChangePasswordActivity
import com.foodly.app.modules.confirmphonenumber.ui.ConfirmPhoneNumberActivity
import com.foodly.app.modules.enteraddress.ui.EnterAddressActivity
import com.foodly.app.modules.featuredpartnersvone.ui.FeaturedPartnersVoneActivity
import com.foodly.app.modules.featuredpartnersvtwo.ui.FeaturedPartnersVtwoActivity
import com.foodly.app.modules.filtersfoodtypevone1.ui.FiltersFoodTypeVone1Activity
import com.foodly.app.modules.filtersvtwo.ui.FiltersVtwoActivity
import com.foodly.app.modules.findrestaurants.ui.FindRestaurantsActivity
import com.foodly.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.foodly.app.modules.homepagevfour.ui.HomepageVfourActivity
import com.foodly.app.modules.homepagevone.ui.HomepageVoneActivity
import com.foodly.app.modules.homepagevthree.ui.HomepageVthreeActivity
import com.foodly.app.modules.homepagevtwo.ui.HomepageVtwoActivity
import com.foodly.app.modules.homepagvieworder.ui.HomepagViewOrderBottomsheet
import com.foodly.app.modules.icons2424.ui.Icons2424Activity
import com.foodly.app.modules.icons3434.ui.Icons3434Activity
import com.foodly.app.modules.locations.ui.LocationsActivity
import com.foodly.app.modules.loginbyphonenumber.ui.LoginByPhoneNumberActivity
import com.foodly.app.modules.orderdetails.ui.OrderDetailsActivity
import com.foodly.app.modules.orderdetails1.ui.OrderDetails1Dialog
import com.foodly.app.modules.paymentmethod.ui.PaymentMethodActivity
import com.foodly.app.modules.profilesettings.ui.ProfileSettingsActivity
import com.foodly.app.modules.refertofriends.ui.ReferToFriendsActivity
import com.foodly.app.modules.resetemail.ui.ResetEmailActivity
import com.foodly.app.modules.scancard.ui.ScanCardActivity
import com.foodly.app.modules.searchfood.ui.SearchFoodActivity
import com.foodly.app.modules.searchingfood.ui.SearchingFoodActivity
import com.foodly.app.modules.searchrestaurants.ui.SearchRestaurantsActivity
import com.foodly.app.modules.searchresultsvone.ui.SearchResultsVoneActivity
import com.foodly.app.modules.searchresultsvtwo.ui.SearchResultsVtwoActivity
import com.foodly.app.modules.sharelinkpopup.ui.ShareLinkPopupActivity
import com.foodly.app.modules.signinvone.ui.SignInVoneActivity
import com.foodly.app.modules.signinvtwo.ui.SignInVtwoActivity
import com.foodly.app.modules.signupvone.ui.SignUpVoneActivity
import com.foodly.app.modules.signupvtwo.ui.SignUpVtwoActivity
import com.foodly.app.modules.singlerestaurants.ui.SingleRestaurantsActivity
import com.foodly.app.modules.singlerestaurantvone.ui.SingleRestaurantVoneActivity
import com.foodly.app.modules.singlerestaurantvtwo.ui.SingleRestaurantVtwoActivity
import com.foodly.app.modules.typelocation.ui.TypeLocationActivity
import com.foodly.app.modules.walkthrough.ui.WalkthroughActivity
import com.foodly.app.modules.walkthrough2.ui.Walkthrough2Activity
import com.foodly.app.modules.walkthrough4.ui.Walkthrough4Activity
import com.foodly.app.modules.yourorders.ui.YourOrdersActivity
import com.foodly.app.modules.yourorders1.ui.YourOrders1Activity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linear32SearchResultsVOne.setOnClickListener {
      val destIntent = SearchResultsVoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear25FiltersfoodTypeVOne.setOnClickListener {
      val destIntent = FiltersFoodTypeVone1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear22AddToOrder.setOnClickListener {
      val destIntent = AddToOrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear03Walkthrough.setOnClickListener {
      val destIntent = Walkthrough2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear20SingleRestaurantVOne.setOnClickListener {
      val destIntent = SingleRestaurantVoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear40ChangePassword.setOnClickListener {
      val destIntent = ChangePasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear09SignUpVTwo.setOnClickListener {
      val destIntent = SignUpVtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear14HomepageVOne.setOnClickListener {
      val destIntent = HomepageVoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear06ForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear01Walkthrough.setOnClickListener {
      val destIntent = Walkthrough4Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear10LoginByPhoneNumber.setOnClickListener {
      val destIntent = LoginByPhoneNumberActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear02Walkthrough.setOnClickListener {
      val destIntent = WalkthroughActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear24AddPaymentMethod.setOnClickListener {
      val destIntent = AddPaymentMethodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear17HomepageVFour.setOnClickListener {
      val destIntent = HomepageVfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear12EnterAddress.setOnClickListener {
      val destIntent = EnterAddressActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear29SearchRestaurants.setOnClickListener {
      val destIntent = SearchRestaurantsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear18FeaturedPartnersVOne.setOnClickListener {
      val destIntent = FeaturedPartnersVoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear46ShareLinkPopup.setOnClickListener {
      val destIntent = ShareLinkPopupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear48BrowseFoods.setOnClickListener {
      val destIntent = BrowseFoodsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear38AccountSettings.setOnClickListener {
      val destIntent = AccountSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear28FiltersVTwo.setOnClickListener {
      val destIntent = FiltersVtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear45ReferToFriends.setOnClickListener {
      val destIntent = ReferToFriendsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear30SearchFood.setOnClickListener {
      val destIntent = SearchFoodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear19FeaturedPartnersVTwo.setOnClickListener {
      val destIntent = FeaturedPartnersVtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear11ConfirmPhoneNumber.setOnClickListener {
      val destIntent = ConfirmPhoneNumberActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear23YourOrders.setOnClickListener {
      val destIntent = YourOrders1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear07ResetEmail.setOnClickListener {
      val destIntent = ResetEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear21SingleRestaurantVTwo.setOnClickListener {
      val destIntent = SingleRestaurantVtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear04SignInVOne.setOnClickListener {
      val destIntent = SignInVoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear50SingleRestaurants.setOnClickListener {
      val destIntent = SingleRestaurantsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear37HomepagViewOrder.setOnClickListener {
      val destFragment = HomepagViewOrderBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, HomepagViewOrderBottomsheet.TAG)
    }
    binding.linear31SearchingFood.setOnClickListener {
      val destIntent = SearchingFoodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear41PaymentMethod.setOnClickListener {
      val destIntent = PaymentMethodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear16HomepageVThree.setOnClickListener {
      val destIntent = HomepageVthreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIcons3434.setOnClickListener {
      val destIntent = Icons3434Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear33SearchResultsVTwo.setOnClickListener {
      val destIntent = SearchResultsVtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear36OrderDetails.setOnClickListener {
      val destFragment = OrderDetails1Dialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, OrderDetails1Dialog.TAG)
    }
    binding.linear35OrderDetails.setOnClickListener {
      val destIntent = OrderDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear39ProfileSettings.setOnClickListener {
      val destIntent = ProfileSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear42CardList.setOnClickListener {
      val destIntent = CardListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear08SignUpVOne.setOnClickListener {
      val destIntent = SignUpVoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIcons2424.setOnClickListener {
      val destIntent = Icons2424Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear15HomepageVTwo.setOnClickListener {
      val destIntent = HomepageVtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear34YourOrders.setOnClickListener {
      val destIntent = YourOrdersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear43Locations.setOnClickListener {
      val destIntent = LocationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear44AddSocialAccounts.setOnClickListener {
      val destIntent = AddSocialAccountsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear13TypeLocation.setOnClickListener {
      val destIntent = TypeLocationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear47ScanCard.setOnClickListener {
      val destIntent = ScanCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear49FindRestaurants.setOnClickListener {
      val destIntent = FindRestaurantsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear05SignInVTwo.setOnClickListener {
      val destIntent = SignInVtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
