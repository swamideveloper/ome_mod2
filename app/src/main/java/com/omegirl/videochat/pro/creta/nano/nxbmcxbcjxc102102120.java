package com.omegirl.videochat.pro.creta.nano;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.qurekalite.predchampp.dog.dddd01d540d5d40;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import com.omegirl.videochat.pro.R;
import com.omegirl.videochat.pro.dfjsbdjkfd10640685;
import com.omegirl.videochat.pro.creta.bits.usdidysi1020121001;
import com.omegirl.videochat.pro.creta.bits.cbxcbjhcxc001201201;
import com.omegirl.videochat.pro.mustang.uhsdfiffhud02101201010;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.UUID;


public class nxbmcxbcjxc102102120 extends AppCompatActivity {

    private static final int GOOGLE_PAY_REQUEST_CODE = 123;


    //rv--
    private ArrayList<cbxcbjhcxc001201201> mList = new ArrayList<>();
    private usdidysi1020121001 adapter = new usdidysi1020121001();
    private RecyclerView listAllPremium;
    private Handler handler;
    private Runnable runnable;
    private final int durationInMS = 50;
    private final int f114dx = 10;
    private String glob_premium_key_type = "";

    public TextView txt_silver;
    public TextView txt_bronze;
    public TextView txt_gold;
    public Uri M = null;
    public String elephant_TagName;
    public String O = "";
    public String elephant_Price = "";
    public String Q;
    public Bitmap R_bitmap;
    public String elephant_MRP;
    public String T = "";


    private String KEY_GOLD = "in_app_gold";
    private String KEY_SILVER = "in_app_silver";
    private String KEY_BRONZE = "in_app_bronze";


//    public class e implements View.OnClickListener {
//        public final AlertDialog c;
//
//        public e(AlertDialog alertDialog) {
//            this.c = alertDialog;
//        }
//
//        public void onClick(View view) {
//            this.c.dismiss();
//            Toast.makeText(nxbmcxbcjxc102102120.this, "open sp--", Toast.LENGTH_SHORT).show();
//        }
//    }

    public class mGpay implements View.OnClickListener {
        public final BottomSheetDialog c;

        public mGpay(BottomSheetDialog bottomSheetDialog) {
            this.c = bottomSheetDialog;
        }

        public void onClick(View view) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pa", new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppUpiId());
                jSONObject.put("pn", elephant_TagName);
                jSONObject.put("am", elephant_MRP);
                jSONObject.put("cu", nxbmcxbcjxc102102120.T("INR"));
                jSONObject.put("tn", nxbmcxbcjxc102102120.Z("Unlock VIP Pass"));
                jSONObject.put("tr", Q);
                jSONObject.put("mc", new mvbcnvmcvc10121013(nxbmcxbcjxc102102120.this).I());
                M = new Uri.Builder().scheme("upi").authority("pay").appendQueryParameter("pa", new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppUpiId()).appendQueryParameter("pn", elephant_TagName).appendQueryParameter("mc", new mvbcnvmcvc10121013(nxbmcxbcjxc102102120.this).I()).appendQueryParameter("tr", Q).appendQueryParameter("tn", nxbmcxbcjxc102102120.Z("Unlock VIP Pass")).appendQueryParameter("am", elephant_MRP).appendQueryParameter("cu", nxbmcxbcjxc102102120.T("INR")).appendQueryParameter("sign", nxbmcxbcjxc102102120.a0(jSONObject.toString())).build();
                nxbmcxbcjxc102102120 elephantStudio = nxbmcxbcjxc102102120.this;
                elephantStudio.R_bitmap = elephantStudio.b0(elephantStudio.M.toString());
                this.c.dismiss();
                nxbmcxbcjxc102102120 elephantStudio2 = nxbmcxbcjxc102102120.this;
                Bitmap bitmap = elephantStudio2.R_bitmap;
                if (bitmap != null) {
//                    Log.e("@@TAG", "bitmap != null");
                    elephantStudio2.d0(bitmap);
                } else {
//                    Log.e("@@TAG", "bitmap == null");
                }

            } catch (JSONException e) {
//                Log.e("@@TAG", "Gpay error: " + e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }

    public class mPhonePay implements View.OnClickListener {
        public final BottomSheetDialog c;

        public mPhonePay(BottomSheetDialog bottomSheetDialog) {
            this.c = bottomSheetDialog;
        }

        public void onClick(View view) {
            this.c.dismiss();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(M);
            intent.setPackage(fhduifhdihf10210101.j());
            Intent createChooser = Intent.createChooser(intent, "Pay with");
            if (createChooser.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(createChooser, 7);
            } else {
                Toast.makeText(nxbmcxbcjxc102102120.this, "No UPI app found, please install one to continue", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public class mOtherApps implements View.OnClickListener {
        public final BottomSheetDialog c;

        public mOtherApps(BottomSheetDialog bottomSheetDialog) {
            this.c = bottomSheetDialog;
        }

        public void onClick(View view) {
            this.c.dismiss();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(M);
            Intent createChooser = Intent.createChooser(intent, "Pay with");
            if (createChooser.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(createChooser, 7);
            } else {
                Toast.makeText(nxbmcxbcjxc102102120.this, "No UPI app found, please install one to continue", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static String S(double d2) {
        return new DecimalFormat("0.00").format(d2).replaceAll("\\.0*$", "");
    }

    public static String T(String str) {
        if (str == null) {
            return "INR";
        }
        String upperCase = str.trim().toUpperCase();
        if (upperCase.length() != 3) {
            return "INR";
        }
        return upperCase;
    }

    public static boolean V(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || !activeNetworkInfo.isConnectedOrConnecting() || !activeNetworkInfo.isAvailable()) {
            return false;
        }
        return true;
    }

    public static String Z(String str) {
        if (str == null) {
            return "Payment";
        }
        String trim = str.trim();
        if (trim.length() > 70) {
            return trim.substring(0, 70);
        }
        return trim;
    }

    public static String a0(String str) {
        Throwable e2;
        String str2;
        byte[] bArr;
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            PrivateKey privateKey = instance.generateKeyPair().getPrivate();
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                str2 = Base64.getEncoder().encodeToString(privateKey.getEncoded());
            } else {
                str2 = android.util.Base64.encodeToString(privateKey.getEncoded(), 0);
            }
            PrintStream printStream = System.out;
            printStream.println("Base64 Encoded Private Key: " + str2);
            if (i >= 26) {
                bArr = Base64.getDecoder().decode(str2);
            } else {
                bArr = android.util.Base64.decode(str2, 0);
            }
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr));
            Signature instance2 = Signature.getInstance("SHA256withRSA");
            instance2.initSign(generatePrivate);
            instance2.update(str.getBytes());
            byte[] sign = instance2.sign();
            if (i >= 26) {
                return Base64.getEncoder().encodeToString(sign);
            }
            return android.util.Base64.encodeToString(sign, 0);
        } catch (NoSuchAlgorithmException e3) {
            e2 = e3;
            throw new RuntimeException(e2);
        } catch (InvalidKeySpecException e4) {
            e2 = e4;
            throw new RuntimeException(e2);
        } catch (InvalidKeyException e5) {
            e2 = e5;
            throw new RuntimeException(e2);
        } catch (SignatureException e6) {
            e2 = e6;
            throw new RuntimeException(e2);
        }
    }

    public final void init_elephant() {
        txt_bronze = (TextView) findViewById(R.id.txt_amt_bronze);
        txt_silver = (TextView) findViewById(R.id.txt_amt_silver);
        txt_gold = (TextView) findViewById(R.id.txt_amt_gold);


        txt_bronze.setText("₹ " + new dddd01d540d5d40(this).getKeyInAppPriceBronze() + "/-");
        txt_silver.setText("₹ " + new dddd01d540d5d40(this).getKeyInAppPriceSilver() + "/-");
        txt_gold.setText("₹ " + new dddd01d540d5d40(this).getKeyInAppPriceGold() + "/-");
    }

    public final void W() {

        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(nxbmcxbcjxc102102120.this);
        View inflate = LayoutInflater.from(nxbmcxbcjxc102102120.this).inflate(R.layout.elephant_payment_apps, (ViewGroup) null, false);
        bottomSheetDialog.setContentView(inflate);

//        View inflate = LayoutInflater.from(this).inflate(R.layout.elephant_payment_apps, (ViewGroup) null);
//        AlertDialog create = new AlertDialog.Builder(this).create();
//        create.setView(inflate);

        inflate.findViewById(R.id.close_di_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialog.dismiss();
            }
        });

        if (new dddd01d540d5d40(nxbmcxbcjxc102102120.this).get_Visible_Code().equals("100")) {
            inflate.findViewById(R.id.radhe_g_pay).setVisibility(View.VISIBLE);
            inflate.findViewById(R.id.radhe_phonepay).setVisibility(View.GONE);
            inflate.findViewById(R.id.radhe_other_app).setVisibility(View.GONE);
        } else if (new dddd01d540d5d40(nxbmcxbcjxc102102120.this).get_Visible_Code().equals("001")) {
            inflate.findViewById(R.id.radhe_g_pay).setVisibility(View.GONE);
            inflate.findViewById(R.id.radhe_phonepay).setVisibility(View.GONE);
            inflate.findViewById(R.id.radhe_other_app).setVisibility(View.VISIBLE);
        } else if (new dddd01d540d5d40(nxbmcxbcjxc102102120.this).get_Visible_Code().equals("000")) {
            inflate.findViewById(R.id.radhe_g_pay).setVisibility(View.GONE);
            inflate.findViewById(R.id.radhe_phonepay).setVisibility(View.GONE);
            inflate.findViewById(R.id.radhe_other_app).setVisibility(View.GONE);
        } else if (new dddd01d540d5d40(nxbmcxbcjxc102102120.this).get_Visible_Code().equals("111")) {
            inflate.findViewById(R.id.radhe_g_pay).setVisibility(View.VISIBLE);
            inflate.findViewById(R.id.radhe_phonepay).setVisibility(View.VISIBLE);
            inflate.findViewById(R.id.radhe_other_app).setVisibility(View.VISIBLE);
        } else if (new dddd01d540d5d40(nxbmcxbcjxc102102120.this).get_Visible_Code().equals("010")) {
            inflate.findViewById(R.id.radhe_g_pay).setVisibility(View.GONE);
            inflate.findViewById(R.id.radhe_phonepay).setVisibility(View.VISIBLE);
            inflate.findViewById(R.id.radhe_other_app).setVisibility(View.GONE);
        } else if (new dddd01d540d5d40(nxbmcxbcjxc102102120.this).get_Visible_Code().equals("110")) {
            inflate.findViewById(R.id.radhe_g_pay).setVisibility(View.VISIBLE);
            inflate.findViewById(R.id.radhe_phonepay).setVisibility(View.VISIBLE);
            inflate.findViewById(R.id.radhe_other_app).setVisibility(View.GONE);
        } else if (new dddd01d540d5d40(nxbmcxbcjxc102102120.this).get_Visible_Code().equals("101")) {
            inflate.findViewById(R.id.radhe_g_pay).setVisibility(View.VISIBLE);
            inflate.findViewById(R.id.radhe_phonepay).setVisibility(View.GONE);
            inflate.findViewById(R.id.radhe_other_app).setVisibility(View.VISIBLE);
        } else if (new dddd01d540d5d40(nxbmcxbcjxc102102120.this).get_Visible_Code().equals("011")) {
            inflate.findViewById(R.id.radhe_g_pay).setVisibility(View.GONE);
            inflate.findViewById(R.id.radhe_phonepay).setVisibility(View.VISIBLE);
            inflate.findViewById(R.id.radhe_other_app).setVisibility(View.VISIBLE);
        }

        inflate.findViewById(R.id.radhe_g_pay).setOnClickListener(new mGpay(bottomSheetDialog));
        inflate.findViewById(R.id.radhe_phonepay).setOnClickListener(new mPhonePay(bottomSheetDialog));
        inflate.findViewById(R.id.radhe_other_app).setOnClickListener(new mOtherApps(bottomSheetDialog));
//        create.show();
        bottomSheetDialog.show();
        Window window = bottomSheetDialog.getWindow();
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(new ColorDrawable(0));
        bottomSheetDialog.setCancelable(false);
    }

    public final void X(String str) {
        this.elephant_MRP = str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pa", new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppUpiId());
            jSONObject.put("pn", this.elephant_TagName);
            jSONObject.put("am", str);
            jSONObject.put("cu", T("INR"));
            jSONObject.put("tn", Z("Unlock VIP Pass"));
            jSONObject.put("tr", this.Q);
            jSONObject.put("mc", new mvbcnvmcvc10121013(this).I());
            Uri build = new Uri.Builder().scheme("upi").authority("pay").appendQueryParameter("pa", new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppUpiId()).appendQueryParameter("pn", this.elephant_TagName).appendQueryParameter("mc", new mvbcnvmcvc10121013(this).I()).appendQueryParameter("tr", this.Q).appendQueryParameter("tn", Z("Unlock VIP Pass")).appendQueryParameter("am", str).appendQueryParameter("cu", T("INR")).appendQueryParameter("sign", a0(jSONObject.toString())).build();
            this.M = build;
            this.R_bitmap = b0(build.toString());
            W();
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Bitmap b0(String str) {
        try {
            Bitmap bitmap = generateQRCode(str, 512, 512);
            return bitmap;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    private Bitmap generateQRCode(String text, int width, int height) throws WriterException {
        BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
        BitMatrix bitMatrix = barcodeEncoder.encode(text, BarcodeFormat.QR_CODE, width, height);
        return barcodeEncoder.createBitmap(bitMatrix);
    }

    public Uri c0(Context context, File file) {
        return FileProvider.getUriForFile(context, getPackageName() + ".provider", file);
    }

    public void d0(Bitmap bitmap) {
        Uri c0 = c0(this, e0(bitmap));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/png");
        intent.putExtra("android.intent.extra.STREAM", c0);
        intent.putExtra("android.intent.extra.SUBJECT", "Payment QR Code");
        intent.putExtra("android.intent.extra.TEXT", "Scan this QR code to make payment");
        intent.setPackage("com.google.android.apps.nbu.paisa.user");
        Intent createChooser = Intent.createChooser(intent, "Pay with");

        if (createChooser.resolveActivity(getPackageManager()) != null) {
//            startActivityForResult(intent, GOOGLE_PAY_REQUEST_CODE);
            startActivityForResult(createChooser, 7);
        } else {
            Toast.makeText(this, "No UPI app found, please install one to continue", Toast.LENGTH_SHORT).show();
        }
    }

    public File e0(Bitmap bitmap) {
        File file = new File(getCacheDir(), "qr_codes");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "qr_code.png");
        if (file2.exists()) {
            file2.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return file2;
    }

    public final void mOutput(ArrayList arrayList) {

//        for (int i = 0; i < arrayList.size(); i++) {
//            Log.e("@@TAG", "mOutput arrayList: " + arrayList.get(i));
//        }

        String[] split;
        if (V(this)) {
            String str = (String) arrayList.get(0);
            if (str == null) {
                str = "discard";
            }
//            Log.e("paumentd", str);
            String str2 = "";
            for (String str3 : str.split("&")) {
                String[] split2 = str3.split("=");
                if (split2.length < 2) {
                    str2 = "Payment cancelled by user.";
                } else if (split2[0].toLowerCase().equals("Status".toLowerCase())) {
                    this.O = split2[1].toLowerCase();
                } else if (split2[0].toLowerCase().equals("ApprovalRefNo".toLowerCase()) || split2[0].toLowerCase().equals("txnRef".toLowerCase())) {
                    this.T = split2[1];
                }
            }

            if (this.O.equals("success")) {
                successPay();
                this.O = "success";
                Toast.makeText(this, "Transaction successful.", Toast.LENGTH_SHORT).show();
            } else if ("Payment cancelled by user.".equals(str2)) {
                this.O = "Payment cancelled by user.";
                Toast.makeText(this, "Payment cancelled by user.", Toast.LENGTH_SHORT).show();
            } else {
                this.O = "Transaction failed.Please try again";
                Toast.makeText(this, "Transaction failed.Please try again", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Internet connection is not available. Please check and try again", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 7) {
//            Log.e("@@TAG", "onActivityResult: if");
            if (-1 != i2 && i2 != 11) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("nothing");
                mOutput(arrayList);

//                Log.e("@@TAG", "onActivityResult: if-1");

            } else if (intent != null) {
                String stringExtra = intent.getStringExtra("response");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(stringExtra);
                mOutput(arrayList2);


                //gpay only (new)
                handleGooglePayResponse(stringExtra);

//                Log.e("@@TAG", "onActivityResult: if-2");

            } else {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add("nothing");
                mOutput(arrayList3);

//                Log.e("@@TAG", "onActivityResult: if-3");
            }
        } else {
//            Log.e("@@TAG", "onActivityResult: else");
        }
    }


    private void handleGooglePayResponse(String response) {
        if (response == null) {
            return;
        }

        // Parsing the response
        try {
            JSONObject responseObject = new JSONObject(response);
            String status = responseObject.getString("Status");
            String approvalRefNo = responseObject.getString("ApprovalRefNo");

            if (status.equals("SUCCESS")) {
                // Payment was successful
                // Do something with the approval reference number
//                Log.e("@@TAG", "GPay Response: SUCCESS");
            } else {
                // Payment failed
                // Handle failure case
//                Log.e("@@TAG", "GPay Response: Payment failed!");
            }
        } catch (JSONException e) {
//            Log.e("@@TAG", "GPay Response: JSONException: " + e.getMessage());
            e.printStackTrace();
        }
    }


    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.elephant_in_app);

        findViewById(R.id.bkk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        //rv--
        listAllPremium = findViewById(R.id.listAllPremium);
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                if (listAllPremium == null || handler == null) {
                    return;
                }
                listAllPremium.smoothScrollBy(f114dx, 0);
                handler.postDelayed(this, durationInMS);
            }
        };
        handler.postDelayed(runnable, 500L);
        setLiveData();


        init_elephant();
        this.Q = UUID.randomUUID().toString().replaceAll("-", "");


        findViewById(R.id.button_pay_silver).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                glob_premium_key_type = KEY_SILVER;
                if (!nxbmcxbcjxc102102120.V(nxbmcxbcjxc102102120.this)) {
                    Toast.makeText(nxbmcxbcjxc102102120.this, "Internet connection is not available. Please check and try again", Toast.LENGTH_SHORT).show();
                } else if (fhduifhdihf10210101.skipDirectPayMode().equals("yes")) {
                    Toast.makeText(nxbmcxbcjxc102102120.this, "Coming Soon....", Toast.LENGTH_SHORT).show();
                } else {

                    elephant_TagName = "Silver Plan";
                    elephant_Price = new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppPriceSilver();
                    elephant_MRP = new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppPriceSilver();
                    X(nxbmcxbcjxc102102120.S(Double.parseDouble(new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppPriceSilver())).replaceAll("\\.0*$", ""));
                }
            }
        });


        findViewById(R.id.button_pay_bronze).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                glob_premium_key_type = KEY_BRONZE;
                if (!nxbmcxbcjxc102102120.V(nxbmcxbcjxc102102120.this)) {
                    Toast.makeText(nxbmcxbcjxc102102120.this, "Internet connection is not available. Please check and try again", Toast.LENGTH_SHORT).show();
                } else if (fhduifhdihf10210101.skipDirectPayMode().equals("yes")) {
                    Toast.makeText(nxbmcxbcjxc102102120.this, "Coming Soon....", Toast.LENGTH_SHORT).show();
                } else {
                    elephant_TagName = "Bronze Plan";
                    elephant_Price = new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppPriceBronze();
                    elephant_MRP = new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppPriceBronze();
                    X(nxbmcxbcjxc102102120.S(Double.parseDouble(new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppPriceBronze())).replaceAll("\\.0*$", ""));
                }
            }
        });

        findViewById(R.id.button_pay_gold).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                glob_premium_key_type = KEY_GOLD;
                if (!nxbmcxbcjxc102102120.V(nxbmcxbcjxc102102120.this)) {
                    Toast.makeText(nxbmcxbcjxc102102120.this, "Internet connection is not available. Please check and try again", Toast.LENGTH_SHORT).show();
                } else if (fhduifhdihf10210101.skipDirectPayMode().equals("yes")) {
                    Toast.makeText(nxbmcxbcjxc102102120.this, "Coming Soon....", Toast.LENGTH_SHORT).show();
                } else {
                    elephant_TagName = "Gold Plan";
                    elephant_Price = new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppPriceGold();
                    elephant_MRP = new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppPriceGold();
                    X(nxbmcxbcjxc102102120.S(Double.parseDouble(new dddd01d540d5d40(nxbmcxbcjxc102102120.this).getKeyInAppPriceGold())).replaceAll("\\.0*$", ""));
                }
            }
        });
    }


    private void setLiveData() {
//        SimpleDateFormat("yyyyMMddHHmmssSS").format(new Date());
        for (int i = 0; i <= 999; i++) {
            mList.add(new cbxcbjhcxc001201201("Gold Package", "92325*****", "12hr ago"));
            mList.add(new cbxcbjhcxc001201201("Gold Package", "95944*****", "16hr ago"));
            mList.add(new cbxcbjhcxc001201201("Silver Package", "99686*****", "1min ago"));
            mList.add(new cbxcbjhcxc001201201("Gold Package", "99441*****", "5min ago"));
            mList.add(new cbxcbjhcxc001201201("Silver Package", "88015*****", "19min ago"));
            mList.add(new cbxcbjhcxc001201201("Gold Package", "96574*****", "45min ago"));
            mList.add(new cbxcbjhcxc001201201("Bronze  Package", "95923*****", "132min ago"));
            mList.add(new cbxcbjhcxc001201201("Silver Package", "96465*****", "15 sec ago"));
            mList.add(new cbxcbjhcxc001201201("Bronze  Package", "99875*****", "5sec ago"));
            mList.add(new cbxcbjhcxc001201201("Bronze  Package", "93955*****", "2min ago"));
            mList.add(new cbxcbjhcxc001201201("Silver Package", "93484*****", "4min ago"));
            mList.add(new cbxcbjhcxc001201201("Bronze  Package", "80843*****", "5sec ago"));
            mList.add(new cbxcbjhcxc001201201("All History", "99255*****", "1min ago"));
            mList.add(new cbxcbjhcxc001201201("Silver Package", "88667*****", "10hr ago"));
            mList.add(new cbxcbjhcxc001201201("Gold Package", "90842*****", "49sec ago"));
            mList.add(new cbxcbjhcxc001201201("Gold Package", "95845*****", "11hr ago"));
            mList.add(new cbxcbjhcxc001201201("All History", "89653*****", "10min ago"));
            mList.add(new cbxcbjhcxc001201201("Silver Package", "91524*****", "5hr ago"));
            mList.add(new cbxcbjhcxc001201201("Gold Package", "98562*****", "50min ago"));
            mList.add(new cbxcbjhcxc001201201("Bronze  Package", "80554*****", "9hr ago"));
            mList.add(new cbxcbjhcxc001201201("Silver Package", "98654*****", "1min ago"));
            mList.add(new cbxcbjhcxc001201201("Gold Package", "97526*****", "44min ago"));
            mList.add(new cbxcbjhcxc001201201("Bronze  Package", "95623*****", "26min ago"));
            mList.add(new cbxcbjhcxc001201201("Silver Package", "90335*****", "2hr ago"));
        }
        adapter.setData(mList);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 100L);
            }
        }, 1000L);
        listAllPremium.setAdapter(adapter);
    }


    //winner----------
    private void successPay() {
        uhsdfiffhud02101201010.setVipType(glob_premium_key_type);

        ScrollView paymentView = findViewById(R.id.paymentView);
        RelativeLayout successView = findViewById(R.id.successView);
        TextView payId = findViewById(R.id.payId);

        manageVip();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                paymentView.setVisibility(View.GONE);
                successView.setVisibility(View.VISIBLE);
                payId.setText("transaction id: " + "TID" + System.currentTimeMillis());

                MediaPlayer mp = MediaPlayer.create(nxbmcxbcjxc102102120.this, R.raw.paysound);
                mp.start();
            }
        }, 500);
    }

    private void manageVip() {
        dfjsbdjkfd10640685.changeVectorStatus(this);
        if (uhsdfiffhud02101201010.getVipType() == "in_app_gold") {
//            Log.e("@@TAG", "in_app_gold---");
            dddd01d540d5d40 dataPreference = new dddd01d540d5d40(this);
            dataPreference.setAdsFlag(false);
            dataPreference.redeemGoldPlan();
            dataPreference.set_IncomingWelcome_Fix();
        } else if (uhsdfiffhud02101201010.getVipType() == "in_app_silver") {
//            Log.e("@@TAG", "in_app_silver---");
            dddd01d540d5d40 dataPreference = new dddd01d540d5d40(this);
            dataPreference.setAdsFlag(false);
            dataPreference.redeemSilverPlan();
        } else if (uhsdfiffhud02101201010.getVipType() == "in_app_bronze") {
//            Log.e("@@TAG", "in_app_bronze---");
            dddd01d540d5d40 dataPreference = new dddd01d540d5d40(this);
            dataPreference.redeemBronzePlan();
            SharedPreferences sh = getSharedPreferences("RandomSF", MODE_APPEND);
            int vc_count = sh.getInt("KEY_RAND", 0);
            if (vc_count == 7) {
                uhsdfiffhud02101201010.setVipType("null");
                Toast.makeText(this, "Bronze Premium Expire! You reached your call limit.", Toast.LENGTH_LONG).show();
            }
        } else {
//            Log.e("@@TAG", "else---");
            Toast.makeText(this, "Something went wrong!", Toast.LENGTH_SHORT).show();
        }
    }

}