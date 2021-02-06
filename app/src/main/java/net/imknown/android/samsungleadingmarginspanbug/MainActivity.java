package net.imknown.android.samsungleadingmarginspanbug;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        initLocale(Locale.KOREAN);

        setContentView(R.layout.activity_main);

        initView();
    }

    private void initLocale(Locale locale) {
        Locale.setDefault(locale);
        Resources resources = getResources();
        Configuration config = resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config, resources.getDisplayMetrics());
    }

    private void initView() {
        TextView tv = findViewById(R.id.tv);
        CharSequence text = tv.getText();
        SpannableString spannableString = new SpannableString(text);
        LeadingMarginSpan lms = new LeadingMarginSpan.Standard(100, 0);
        spannableString.setSpan(lms, 0, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(spannableString);
    }
}