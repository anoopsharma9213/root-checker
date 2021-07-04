# Root Properties Checker
Root Properties Checker based on Meat Grinder

Checkout the original repository over here [DimaKoz/meat-grinder](https://github.com/DimaKoz/meat-grinder)

## How to implement in your project
1. Copy code from Line Number [15](https://github.com/anoopsharma9213/root-checker/blob/5309004fe79f1e7f6d603e581dfa7b7cc49312f3/app/build.gradle#L15) to [23](https://github.com/anoopsharma9213/root-checker/blob/5309004fe79f1e7f6d603e581dfa7b7cc49312f3/app/build.gradle#L23) from [app/buil.gradle](https://github.com/anoopsharma9213/root-checker/blob/5309004fe79f1e7f6d603e581dfa7b7cc49312f3/app/build.gradle)
2. Copy code from Line Number [32](https://github.com/anoopsharma9213/root-checker/blob/5309004fe79f1e7f6d603e581dfa7b7cc49312f3/app/build.gradle#L32) to [36](https://github.com/anoopsharma9213/root-checker/blob/5309004fe79f1e7f6d603e581dfa7b7cc49312f3/app/build.gradle#L36) from [app/buil.gradle](https://github.com/anoopsharma9213/root-checker/blob/5309004fe79f1e7f6d603e581dfa7b7cc49312f3/app/build.gradle)
3. Copy [app/src/main/java/com/lse/rootchecker/MeatGrinder.java](https://github.com/anoopsharma9213/root-checker/blob/main/app/src/main/java/com/lse/rootchecker/MeatGrinder.java) into your project
4. Copy [app/src/main/jni](https://github.com/anoopsharma9213/root-checker/tree/main/app/src/main/jni) folder into your project
5. Change **com_lse_rootchecker** to your package name in [app/src/main/jni/native-lib.c](https://github.com/anoopsharma9213/root-checker/blob/main/app/src/main/jni/native-lib.c)
6. Run you project. Now you should be able to use the root detection methods of Meat Grinder.

## Other libraries

 * Scott Alexander-Bown and Mat Rollings' [RootBeer library](https://github.com/scottyab/rootbeer).
