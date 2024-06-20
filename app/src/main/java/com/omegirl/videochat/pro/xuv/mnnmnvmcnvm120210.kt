package com.omegirl.videochat.pro.xuv

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.qurekalite.predchampp.dog.dddd01d540d5d40

import com.omegirl.videochat.pro.R
import com.omegirl.videochat.pro.dfjsbdjkfd10640685
import com.omegirl.videochat.pro.mustang.uhsdfiffhud02101201010
import dev.shreyaspatil.easyupipayment.EasyUpiPayment
import dev.shreyaspatil.easyupipayment.listener.PaymentStatusListener
import dev.shreyaspatil.easyupipayment.model.TransactionDetails
import dev.shreyaspatil.easyupipayment.model.TransactionStatus
import kotlinx.android.synthetic.main.activity_in_app.bkk
import kotlinx.android.synthetic.main.activity_in_app.button_pay_bronze
import kotlinx.android.synthetic.main.activity_in_app.button_pay_gold
import kotlinx.android.synthetic.main.activity_in_app.button_pay_silver
import kotlinx.android.synthetic.main.activity_in_app.payId
import kotlinx.android.synthetic.main.activity_in_app.paymentView
import kotlinx.android.synthetic.main.activity_in_app.successView
import kotlinx.android.synthetic.main.activity_in_app.txt_amt_bronze
import kotlinx.android.synthetic.main.activity_in_app.txt_amt_gold
import kotlinx.android.synthetic.main.activity_in_app.txt_amt_silver
import java.text.SimpleDateFormat
import java.util.Date

class mnnmnvmcnvm120210 : AppCompatActivity(), PaymentStatusListener {

    //rv--
    var mList = ArrayList<dmofjdifjd98789>()
    var adapter = wiwiwiwi210212()
    var listAllPremium: RecyclerView? = null
    private var handler: Handler? = null
    private var runnable: Runnable? = null
    private val durationInMS = 50
    private val f114dx = 10
    private var glob_premium_key_type = "";

    //inApp--
    private lateinit var easyUpiPayment: EasyUpiPayment
    private val KEY_GOLD = "in_app_gold"
    private val KEY_SILVER = "in_app_silver"
    private val KEY_BRONZE = "in_app_bronze"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_in_app)

        //inApp--
        initViews()

        //rv--
        listAllPremium = findViewById<View>(R.id.listAllPremium) as RecyclerView
        handler = Handler()
        val runnable: Runnable = object : Runnable {
            override fun run() {
                if (listAllPremium == null || handler == null) {
                    return
                }
                listAllPremium!!.smoothScrollBy(f114dx, 0)
                handler!!.postDelayed(this, durationInMS.toLong())
            }
        }
        this.runnable = runnable
        val handler = handler
        handler?.postDelayed(runnable, 500L)
        setLiveData()
    }

    private fun initViews() {

        bkk.setOnClickListener { onBackPressed() }

        setPrice()
        button_pay_gold.setOnClickListener { pay(KEY_GOLD) }
        button_pay_silver.setOnClickListener { pay(KEY_SILVER) }
        button_pay_bronze.setOnClickListener {

            val sh = getSharedPreferences("RandomSF", MODE_APPEND)
            val vc_count = sh.getInt("KEY_RAND", 0)
            if (vc_count == 7) {
                Toast.makeText(this, "This plan is used! Try a different plan.", Toast.LENGTH_LONG)
                    .show()
            } else {
                pay(KEY_BRONZE)
            }

        }

        bkk.setOnClickListener { onBackPressed() }
    }

    private fun setPrice() {
        txt_amt_gold.text = "₹ " + dddd01d540d5d40(
            this
        ).keyInAppPriceGold + "/-"
        txt_amt_silver.text = "₹ " + dddd01d540d5d40(
            this
        ).keyInAppPriceSilver + "/-"
        txt_amt_bronze.text = "₹ " + dddd01d540d5d40(
            this
        ).keyInAppPriceBronze + "/-"
    }

    private fun pay(premium_key_type: String) {

        var amount = "0"
        glob_premium_key_type = premium_key_type;
        if (premium_key_type == KEY_GOLD) {
            amount = dddd01d540d5d40(this).keyInAppPriceGold
        } else if (premium_key_type == KEY_SILVER) {
            amount = dddd01d540d5d40(this).keyInAppPriceSilver
        } else if (premium_key_type == KEY_BRONZE) {
            amount = dddd01d540d5d40(this).keyInAppPriceBronze
        } else {
            Toast.makeText(this, "something went wrong!", Toast.LENGTH_SHORT)
        }


        val payeeVpa = dddd01d540d5d40(this).keyInAppUpiId
        val payeeName = dddd01d540d5d40(this).keyInAppUpiName
        val transactionId = "TID" + System.currentTimeMillis()
        val transactionRefId = "TID" + System.currentTimeMillis()
        val payeeMerchantCode = "";
        val description = dddd01d540d5d40(this).keyInAppUpiDesc



        try {
            easyUpiPayment = EasyUpiPayment(this) {
                this.paymentApp = paymentApp
                this.payeeVpa = payeeVpa
                this.payeeName = payeeName
                this.transactionId = transactionId
                this.transactionRefId = transactionRefId
                this.payeeMerchantCode = payeeMerchantCode
                this.description = description + premium_key_type;
                this.amount = "$amount.00"
            }

            easyUpiPayment.setPaymentStatusListener(this)
            easyUpiPayment.startPayment()
        } catch (e: Exception) {
            e.printStackTrace()
            toast("Error: ${e.message}")
        }
    }

    override fun onTransactionCompleted(transactionDetails: TransactionDetails) {
        when (transactionDetails.transactionStatus) {
            TransactionStatus.SUCCESS -> onTransactionSuccess()
            TransactionStatus.FAILURE -> onTransactionFailed()
            TransactionStatus.SUBMITTED -> onTransactionSubmitted()
        }
    }

    override fun onTransactionCancelled() {
        toast("Cancelled by user")
    }

    private fun onTransactionSuccess() {
        toast("Payment Success!")
        uhsdfiffhud02101201010.setVipType(glob_premium_key_type)
        successPay()
    }

    private fun onTransactionSubmitted() {
//        toast("Pending | Submitted")
    }

    private fun onTransactionFailed() {
        toast("Payment Failed!")
    }

    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun setLiveData() {
        SimpleDateFormat("yyyyMMddHHmmssSS").format(Date())
        for (i in 0..999) {
            mList.add(dmofjdifjd98789("Gold Package", "92325*****", "12hr ago"))
            mList.add(dmofjdifjd98789("Gold Package", "95944*****", "16hr ago"))
            mList.add(dmofjdifjd98789("Silver Package", "99686*****", "1min ago"))
            mList.add(dmofjdifjd98789("Gold Package", "99441*****", "5min ago"))
            mList.add(dmofjdifjd98789("Silver Package", "88015*****", "19min ago"))
            mList.add(dmofjdifjd98789("Gold Package", "96574*****", "45min ago"))
            mList.add(dmofjdifjd98789("Bronze  Package", "95923*****", "132min ago"))
            mList.add(dmofjdifjd98789("Silver Package", "96465*****", "15 sec ago"))
            mList.add(dmofjdifjd98789("Bronze  Package", "99875*****", "5sec ago"))
            mList.add(dmofjdifjd98789("Bronze  Package", "93955*****", "2min ago"))
            mList.add(dmofjdifjd98789("Silver Package", "93484*****", "4min ago"))
            mList.add(dmofjdifjd98789("Bronze  Package", "80843*****", "5sec ago"))
            mList.add(dmofjdifjd98789("All History", "99255*****", "1min ago"))
            mList.add(dmofjdifjd98789("Silver Package", "88667*****", "10hr ago"))
            mList.add(dmofjdifjd98789("Gold Package", "90842*****", "49sec ago"))
            mList.add(dmofjdifjd98789("Gold Package", "95845*****", "11hr ago"))
            mList.add(dmofjdifjd98789("All History", "89653*****", "10min ago"))
            mList.add(dmofjdifjd98789("Silver Package", "91524*****", "5hr ago"))
            mList.add(dmofjdifjd98789("Gold Package", "98562*****", "50min ago"))
            mList.add(dmofjdifjd98789("Bronze  Package", "80554*****", "9hr ago"))
            mList.add(dmofjdifjd98789("Silver Package", "98654*****", "1min ago"))
            mList.add(dmofjdifjd98789("Gold Package", "97526*****", "44min ago"))
            mList.add(dmofjdifjd98789("Bronze  Package", "95623*****", "26min ago"))
            mList.add(dmofjdifjd98789("Silver Package", "90335*****", "2hr ago"))
        }
        adapter.setData(mList)
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(object : Runnable {
            override fun run() {
                handler.postDelayed(this, 100L)
            }
        }, 1000L)
        listAllPremium!!.adapter = adapter
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }


    private fun successPay() {
        manageVip()
        Handler().postDelayed({
            paymentView.visibility = View.GONE
            successView.visibility = View.VISIBLE
            payId.text = "transaction id: " + "TID" + System.currentTimeMillis()

            val mp = MediaPlayer.create(this, R.raw.paysound)
            mp.start()
        }, 500)
    }

    private fun manageVip() {
        dfjsbdjkfd10640685.changeVectorStatus(this)
        if (uhsdfiffhud02101201010.getVipType() == "in_app_gold") {
            dddd01d540d5d40(this).setAdsFlag(false)
            dddd01d540d5d40(this).redeemGoldPlan()
            dddd01d540d5d40(this).set_IncomingWelcome_Fix()
        } else if (uhsdfiffhud02101201010.getVipType() == "in_app_silver") {
            dddd01d540d5d40(this).setAdsFlag(false)
            dddd01d540d5d40(this).redeemSilverPlan()
        } else if (uhsdfiffhud02101201010.getVipType() == "in_app_bronze") {
            dddd01d540d5d40(this).redeemBronzePlan()
            val sh = getSharedPreferences("RandomSF", MODE_APPEND)
            val vc_count = sh.getInt("KEY_RAND", 0)
            if (vc_count == 7) {
                uhsdfiffhud02101201010.setVipType("null")
                Toast.makeText(
                    this,
                    "Bronze Premium Expire! You reached your call limit.",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}