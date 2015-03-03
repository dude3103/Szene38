package com.example.dude.szene38;

/**
 * Created by Dude on 01.03.2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class btn5 extends Activity {
    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.webview1);


        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://szene38.de/fotos/");
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Prüfen, ob wirklich Zurück gedrückt wurde und ob vorher Seiten besucht wurden
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        // Wenn es nicht die Zurück-Taste war oder keine Seitenhistory verfügbar ist, wird die Default-    Methode ausgeführt. Meist ist dass das Beenden der Aktivität
        return super.onKeyDown(keyCode, event);
    }
}
