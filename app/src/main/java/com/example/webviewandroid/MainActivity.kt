package com.example.webviewandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Adding URL value

    private val BASE_URL = "https://baseavalancha.com/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enabling JavaScript

        val settings :WebSettings = WebView.settings
        settings.javaScriptEnabled = true

        // WebView Insertion

        WebView.webViewClient = object : WebViewClient() {

            }

        WebView.webChromeClient = object  : WebChromeClient (){

        }

        //Loading URL to WebView

        WebView.loadUrl(BASE_URL)

        }

        override fun onBackPressed(){
            if(WebView.canGoBack()) {
                WebView.goBack()
            } else {
                super.onBackPressed()
            }

        }


    }
