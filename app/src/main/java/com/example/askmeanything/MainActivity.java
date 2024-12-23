package com.example.askmeanything;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.edittext);
        webView = findViewById(R.id.webview);
        webView.setWebViewClient (new Browser ());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString();
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);
            }
        });

        //WebView - it is a view that displays web pages inside our application.
        //need to specify HTML string and it will show it inside our app using webview.

        //to add webview we need to add ‹WebView> xml tag to our layout file.
        //create an object of the class WebView in our java file

        //WebView browser = findViewById(R.id.webview);

        //loadUrl(string url) - in order to load a web url into the webview we need to call a method of the webview class

        //canGoBack() - this method specifies the webview has a back history item
        //canGoForward() - this method specifies the webview has a forward history item
        //clearHistory() - this method will clear the webview forward and backward history
        //destroy() - this method destroys the internal state of webview
        //findAllAsync(String find) - this method finds all instances of string and highlight them.
        //getProgress() - this method gets the progress of the current page
        //getTitle() - will return the title of the current page
        //getUrl() - will return the url of the current page


        //@override
        //public boolean shouldOverrideUrlLoading (WebView view, String url) {
        //view. loadUrl(url);
        //return true;
        //}




    }
    private class Browser extends WebViewClient{
        public boolean shouldOverrideUrlLoading (WebView view, String url){
            view. loadUrl(url);
            return true;
        }
    }
}