public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true); // 啟用 JS
        webView.getSettings().setDomStorageEnabled(true); // 啟用存儲空間
        
        // 進入全螢幕模式
        webView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        
        webView.loadUrl("file:///android_asset/index.html");
        setContentView(webView);
    }
}
