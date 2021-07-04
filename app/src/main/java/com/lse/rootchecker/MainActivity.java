package com.lse.rootchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView
            check_begin_1,
            check_begin_2,
            check_begin_3,
            check_begin_4,
            check_begin_5,
            check_begin_6,
            check_begin_7,
            check_begin_8,
            check_begin_9,
            check_begin_10,
            check_begin_11,
            check_begin_12,
            check_begin_13,
            check_fail_1,
            check_fail_2,
            check_fail_3,
            check_fail_4,
            check_fail_5,
            check_fail_6,
            check_fail_7,
            check_fail_8,
            check_fail_9,
            check_fail_10,
            check_fail_11,
            check_fail_12,
            check_fail_13,
            check_done_1,
            check_done_2,
            check_done_3,
            check_done_4,
            check_done_5,
            check_done_6,
            check_done_7,
            check_done_8,
            check_done_9,
            check_done_10,
            check_done_11,
            check_done_12,
            check_done_13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout check_1 = findViewById(R.id.check_1);
        LinearLayout check_2 = findViewById(R.id.check_2);
        LinearLayout check_3 = findViewById(R.id.check_3);
        LinearLayout check_4 = findViewById(R.id.check_4);
        LinearLayout check_5 = findViewById(R.id.check_5);
        LinearLayout check_6 = findViewById(R.id.check_6);
        LinearLayout check_7 = findViewById(R.id.check_7);
        LinearLayout check_8 = findViewById(R.id.check_8);
        LinearLayout check_9 = findViewById(R.id.check_9);
        LinearLayout check_10 = findViewById(R.id.check_10);
        LinearLayout check_11 = findViewById(R.id.check_11);
        LinearLayout check_12 = findViewById(R.id.check_12);
        LinearLayout check_13 = findViewById(R.id.check_13);
        check_begin_1 = findViewById(R.id.check_begin_1);
        check_begin_2 = findViewById(R.id.check_begin_2);
        check_begin_3 = findViewById(R.id.check_begin_3);
        check_begin_4 = findViewById(R.id.check_begin_4);
        check_begin_5 = findViewById(R.id.check_begin_5);
        check_begin_6 = findViewById(R.id.check_begin_6);
        check_begin_7 = findViewById(R.id.check_begin_7);
        check_begin_8 = findViewById(R.id.check_begin_8);
        check_begin_9 = findViewById(R.id.check_begin_9);
        check_begin_10 = findViewById(R.id.check_begin_10);
        check_begin_11 = findViewById(R.id.check_begin_11);
        check_begin_12 = findViewById(R.id.check_begin_12);
        check_begin_13 = findViewById(R.id.check_begin_13);
        check_fail_1 = findViewById(R.id.check_fail_1);
        check_fail_2 = findViewById(R.id.check_fail_2);
        check_fail_3 = findViewById(R.id.check_fail_3);
        check_fail_4 = findViewById(R.id.check_fail_4);
        check_fail_5 = findViewById(R.id.check_fail_5);
        check_fail_6 = findViewById(R.id.check_fail_6);
        check_fail_7 = findViewById(R.id.check_fail_7);
        check_fail_8 = findViewById(R.id.check_fail_8);
        check_fail_9 = findViewById(R.id.check_fail_9);
        check_fail_10 = findViewById(R.id.check_fail_10);
        check_fail_11 = findViewById(R.id.check_fail_11);
        check_fail_12 = findViewById(R.id.check_fail_12);
        check_fail_13 = findViewById(R.id.check_fail_13);
        check_done_1 = findViewById(R.id.check_done_1);
        check_done_2 = findViewById(R.id.check_done_2);
        check_done_3 = findViewById(R.id.check_done_3);
        check_done_4 = findViewById(R.id.check_done_4);
        check_done_5 = findViewById(R.id.check_done_5);
        check_done_6 = findViewById(R.id.check_done_6);
        check_done_7 = findViewById(R.id.check_done_7);
        check_done_8 = findViewById(R.id.check_done_8);
        check_done_9 = findViewById(R.id.check_done_9);
        check_done_10 = findViewById(R.id.check_done_10);
        check_done_11 = findViewById(R.id.check_done_11);
        check_done_12 = findViewById(R.id.check_done_12);
        check_done_13 = findViewById(R.id.check_done_13);

        check_fail_1.setVisibility(View.GONE);
        check_fail_2.setVisibility(View.GONE);
        check_fail_3.setVisibility(View.GONE);
        check_fail_4.setVisibility(View.GONE);
        check_fail_5.setVisibility(View.GONE);
        check_fail_6.setVisibility(View.GONE);
        check_fail_7.setVisibility(View.GONE);
        check_fail_8.setVisibility(View.GONE);
        check_fail_9.setVisibility(View.GONE);
        check_fail_10.setVisibility(View.GONE);
        check_fail_11.setVisibility(View.GONE);
        check_fail_12.setVisibility(View.GONE);
        check_fail_13.setVisibility(View.GONE);
        check_done_1.setVisibility(View.GONE);
        check_done_2.setVisibility(View.GONE);
        check_done_3.setVisibility(View.GONE);
        check_done_4.setVisibility(View.GONE);
        check_done_5.setVisibility(View.GONE);
        check_done_6.setVisibility(View.GONE);
        check_done_7.setVisibility(View.GONE);
        check_done_8.setVisibility(View.GONE);
        check_done_9.setVisibility(View.GONE);
        check_done_10.setVisibility(View.GONE);
        check_done_11.setVisibility(View.GONE);
        check_done_12.setVisibility(View.GONE);
        check_done_13.setVisibility(View.GONE);

        check_1.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isDetectedTestKeys();
                Log.d("AppLog", "Test 1 Result => " + result);

                check_begin_1.setVisibility(View.GONE);
                check_fail_1.setVisibility(View.GONE);
                check_done_1.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Detected Test Keys Found", Toast.LENGTH_SHORT).show();
                    check_fail_1.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Detected Test Keys Found", Toast.LENGTH_SHORT).show();
                    check_done_1.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_2.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isDetectedDevKeys();
                Log.d("AppLog", "Test 2 Result => " + result);

                check_begin_2.setVisibility(View.GONE);
                check_fail_2.setVisibility(View.GONE);
                check_done_2.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Detected Dev Keys Found", Toast.LENGTH_SHORT).show();
                    check_fail_2.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Detected Dev Keys Found", Toast.LENGTH_SHORT).show();
                    check_done_2.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_3.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isNotFoundReleaseKeys();
                Log.d("AppLog", "Test 3 Result => " + result);

                check_begin_3.setVisibility(View.GONE);
                check_fail_3.setVisibility(View.GONE);
                check_done_3.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Release Keys not Found", Toast.LENGTH_SHORT).show();
                    check_fail_3.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "Release Keys Found", Toast.LENGTH_SHORT).show();
                    check_done_3.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_4.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isFoundDangerousProps();
                Log.d("AppLog", "Test 4 Result => " + result);

                check_begin_4.setVisibility(View.GONE);
                check_fail_4.setVisibility(View.GONE);
                check_done_4.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Dangerous Props Found", Toast.LENGTH_SHORT).show();
                    check_fail_4.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Dangerous Props Found", Toast.LENGTH_SHORT).show();
                    check_done_4.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_5.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isPermissiveSelinux();
                Log.d("AppLog", "Test 5 Result => " + result);

                check_begin_5.setVisibility(View.GONE);
                check_fail_5.setVisibility(View.GONE);
                check_done_5.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Permissive Selinux", Toast.LENGTH_SHORT).show();
                    check_fail_5.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Permissive Selinux", Toast.LENGTH_SHORT).show();
                    check_done_5.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_6.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isSuExists();
                Log.d("AppLog", "Test 6 Result => " + result);

                check_begin_6.setVisibility(View.GONE);
                check_fail_6.setVisibility(View.GONE);
                check_done_6.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Detected SU", Toast.LENGTH_SHORT).show();
                    check_fail_6.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Detected SU", Toast.LENGTH_SHORT).show();
                    check_done_6.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_7.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isAccessedSuperuserApk();
                Log.d("AppLog", "Test 7 Result => " + result);

                check_begin_7.setVisibility(View.GONE);
                check_fail_7.setVisibility(View.GONE);
                check_done_7.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Detected SU APK", Toast.LENGTH_SHORT).show();
                    check_fail_7.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Detected SU APK", Toast.LENGTH_SHORT).show();
                    check_done_7.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_8.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isFoundSuBinary();
                Log.d("AppLog", "Test 8 Result => " + result);

                check_begin_8.setVisibility(View.GONE);
                check_fail_8.setVisibility(View.GONE);
                check_done_8.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Detected SU BINARY", Toast.LENGTH_SHORT).show();
                    check_fail_8.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Detected SU BINARY", Toast.LENGTH_SHORT).show();
                    check_done_8.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_9.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isFoundBusyboxBinary();
                Log.d("AppLog", "Test 9 Result => " + result);

                check_begin_9.setVisibility(View.GONE);
                check_fail_9.setVisibility(View.GONE);
                check_done_9.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Detected BUSYBOX Binary", Toast.LENGTH_SHORT).show();
                    check_fail_9.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Detected BUSYBOX Binary", Toast.LENGTH_SHORT).show();
                    check_done_9.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_10.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isFoundXposed();
                Log.d("AppLog", "Test 10 Result => " + result);

                check_begin_10.setVisibility(View.GONE);
                check_fail_10.setVisibility(View.GONE);
                check_done_10.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Detected Xposed", Toast.LENGTH_SHORT).show();
                    check_fail_10.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Detected Xposed", Toast.LENGTH_SHORT).show();
                    check_done_10.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_11.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isFoundResetprop();
                Log.d("AppLog", "Test 11 Result => " + result);

                check_begin_11.setVisibility(View.GONE);
                check_fail_11.setVisibility(View.GONE);
                check_done_11.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Detected Reset Prop", Toast.LENGTH_SHORT).show();
                    check_fail_11.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Detected Reset Prop", Toast.LENGTH_SHORT).show();
                    check_done_11.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_12.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isFoundWrongPathPermission();
                Log.d("AppLog", "Test 12 Result => " + result);

                check_begin_12.setVisibility(View.GONE);
                check_fail_12.setVisibility(View.GONE);
                check_done_12.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Detected Wrong Path Permission", Toast.LENGTH_SHORT).show();
                    check_fail_12.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Detected Wrong Path Permission", Toast.LENGTH_SHORT).show();
                    check_done_12.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });

        check_13.setOnClickListener(v -> {
            if (MeatGrinder.getInstance().isLibraryLoaded()) {
                boolean result = MeatGrinder.getInstance().isFoundHooks();
                Log.d("AppLog", "Test 13 Result => " + result);

                check_begin_13.setVisibility(View.GONE);
                check_fail_13.setVisibility(View.GONE);
                check_done_13.setVisibility(View.GONE);
                if(result){
                    Toast.makeText(getApplicationContext(), "Detected Hooks", Toast.LENGTH_SHORT).show();
                    check_fail_13.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "No Detected Hooks", Toast.LENGTH_SHORT).show();
                    check_done_13.setVisibility(View.VISIBLE);
                }
            } else {
                Toast.makeText(getApplicationContext(), "Error running Test", Toast.LENGTH_SHORT).show();
            }
        });
    }
}