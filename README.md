# LeadingMarginSpan bug in JP or KR Locale on OneUI
> - https://developer.samsung.com/dashboard/support/31085  
> - https://forum.developer.samsung.com/t/leadingmarginspan-bug-in-jp-or-kr-locale-on-oneui/11105

Go to the "Language" page in the "Settings".  
Make sure **ONLY ONE** Japanese or Korean is in the language list.  
Apply the settings then go back to the demo app page.  
You can confirm the current language the in ActionBar title.  
(P.S.: However, Chinese is ok. It is magical.)

This issue can be **100%** reproduced on any Samsung phone  
using OneUI 1, 2 and 3 (reffed to the Android 9, 10, and 11).  
There is no such issue on pure AOSP (5 ~ 11),  
or any other OEM bands StockROM like Sony, Xiaomi, etc.

## 1.0.2 screenshots
<img src="https://github.com/imknown/SamsungLeadingMarginSpanBug/releases/download/1.0.2/samsung.linebreak.strategy.jpg" width="20%" height="20%"/>

## 1.0.1 screenshots
<img src="https://github.com/imknown/SamsungLeadingMarginSpanBug/releases/download/1.0.1/01-jp.jpg" width="20%" height="20%"/> <img src="https://github.com/imknown/SamsungLeadingMarginSpanBug/releases/download/1.0.1/02-kr.jpg" width="20%" height="20%"/> <img src="https://github.com/imknown/SamsungLeadingMarginSpanBug/releases/download/1.0.1/03-zh_CN.jpg" width="20%" height="20%"/> <img src="https://github.com/imknown/SamsungLeadingMarginSpanBug/releases/download/1.0.1/04-en_US.jpg" width="20%" height="20%"/>

## 1.0.0 screenshots
Samsung A6s, Android 8.1, correct:  
<img src="https://github.com/imknown/SamsungLeadingMarginSpanBug/releases/download/1.0.0/Samsung.A6s.Android.8.1.correct.png" width="20%" height="20%"/>

Samsung Note 9, Android 10 with OneUI, incorrect:  
<img src="https://github.com/imknown/SamsungLeadingMarginSpanBug/releases/download/1.0.0/Samsung.Note.9.Android.10.with.OneUI.incorrect.png" width="20%" height="20%"/>
