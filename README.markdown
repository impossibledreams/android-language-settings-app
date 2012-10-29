What Does This App Do?
======================
This is a simple Android application that allows you to access the built in settings screen to select additional input language for your Android keyboard. The primary motivation for creation of this app was the fact that the Kindle Fire does not allow you to select languages while including the secret settings panel deep inside their code. Some other manufacturers appear to have done the same.

Full credit goes to [Gero Zahn](http://blog.gerozahn.de/2011/11/kindle-fire-keyboard-layouts-solved/) who was the first person who discovered the "hidden settings panel" for languages in the Kindle Fire.

Many thanks to the users who have tried this app out, provided valuable feedback and acted as beta testers.

How to Install
--------------
The easiest way to install this app is by visiting [Google Market](https://market.android.com/details?id=appinventor.ai_yakov.LanguageSettings) or [Amazon AppStore for Android](http://www.amazon.com/gp/product/B0071LQXCK).

If you are unable to install this app from either of those places, you can do the following to install it manually:

1. Enable sideloading of third party apps as follows.
2. On most Android devices, select the menu button from the home screen, then "Settings", "Applications".
3. On the Kindle Fire only, tap the top right corner of your home screen, select "More", "Device".
4. Make sure the checkbox described "Allow installation of non-Market applications" or "Allow installation of applications from unknown sources" is checked on.
5. Download the APK file from [the downloads section here](https://github.com/shaftekbiz/android-language-settings-app/downloads) (download link is below the QR barcode).
6. Install the app on your device by click on it in the downloads list.

Feedback and comments should be directed via [email](mailto:android-dev@shaftek.biz), [our website](http://www.shaftek.biz/contact/) or via the GitHub bug tracker.

Compatibility
-------------
This app has been tested on Android 2.2, 2.3, 3.2, 4.0.3 and 4.1. It also has been tested on Kindle Fire (1st and 2nd gen), and Kindle Fire HD.

On the Kindle Fire (1st gen), even though there are many languages listed as available, only the following languages actually work:

- Danish
- English UK/US
- French
- German
- Hebrew
- Norwegian
- Russian
- Serbian
- Swedish

Based on emulator testing, the following languages SHOULD be supported on the Kindle Fire (2nd gen). Please report any that do not work:

- Arabic
- Czech
- Danish
- English UK/US
- Finnish
- French and French/Switzerland
- Hebrew
- Norwegian
- Russian
- Serbian
- Spanish
- Swedish

Known Issues
------------
On Kindle Fire, you may need to delete an old version of this app before reinstalling an updated version.

** As of October 27th, 2012, the latest Kindle Fire (second generation) update has wiped out almost all the languages. We are currently looking into this.

For Developers:
---------------
Background information about this app can be found on [my blog](http://www.shaftek.org/blog/2011/12/03/enabling-other-languages-on-amazons-new-kindle-fire-tablet/).

The original version of this app was developed via Google's AppInventor package, as of v1.2, this is now a native Android App. The easiest way to recompile and try this app out is to use Eclipse with Android plugins.

Feel free to submit requests for features or patches.

Copyright Information
---------------------
This program is licensed under the GPLv3 or later, see LICENSE file for more information about copyright and licensing.

This program was developed by Yakov Shafranovich / Shaftek Enterprises LLC.

History of Changes
==================
v1.5 (5) - 10/05/2012 - Support for Kindle Fire (2nd gen) and Kindle Fire HD. Support for Android 4.0.3 (ICS) and 4.1 (JellyBean).

v1.3 (4) - 01/22/2012 - Support for Android 3.x added; open sourced via GitHub

v1.2 (3) - 01/22/2012 - App rewritten as a real Android native app, dumping the AppInventor code; support for Android 4.0 added

v1.1 (2) - 12/01/2011 - Minor manifest changes to narrow down the range of eligible devices

v1.0 (1) - 12/01/2011 - First release