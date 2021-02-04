# LeadingMarginSpan bug in JP or KR Locale on OneUI

When first system language list is Japanese or Korean,  
or explicitly set the locale language to Japanese or Korean,  
the follow code using LeadingMarginSpan leads the bug.  
However, Chinese is ok. It is magical.

This issue can be **100%** reproduced on any Samsung phone  
using OneUI 1, 2 and 3 (refs to the Android 9, 10, and 11).  
There is no such issue on pure AOSP (5~11).  
or any other OEM bands StockROM like Sony, Xiaomi, etc.