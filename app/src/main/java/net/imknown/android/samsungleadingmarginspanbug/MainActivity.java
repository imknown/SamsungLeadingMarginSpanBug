package net.imknown.android.samsungleadingmarginspanbug;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.util.TypedValue;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends Activity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        initLocale(Locale.KOREAN);

        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

        setText();
    }

    private void initLocale(Locale locale) {
        Locale.setDefault(locale);
        Resources resources = getResources();
        Configuration config = resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config, resources.getDisplayMetrics());
    }

    private void setText() {
        String currentLocaleLanguageTag = Locale.getDefault().getDisplayName();
        getActionBar().setTitle(currentLocaleLanguageTag);

        CharSequence text = tv.getText();
        SpannableString spannableString = new SpannableString(text);
        int the170dp = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 170, getResources().getDisplayMetrics()
        );
        LeadingMarginSpan lms = new LeadingMarginSpan.Standard(the170dp, 0);
        spannableString.setSpan(lms, 0, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(spannableString);
    }
}