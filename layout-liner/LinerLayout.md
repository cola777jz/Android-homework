# 一、R

```java
    /**
     * Android 中可以通过 R. 获得各种资源信息
     * <b>R 用于映射 res 中的各种资源</b>
     * R.id  获取 对应 id 的资源信息
     * R.string  获取 values 中 strings.xml 中定义的信息
     * R.color  获取 values 中 colors.xml 中定义的信息
     * R.drawable  获取 drawable 中相关信息
     * R.layout  获取 layout 中相关信息
     */
    void getResource(){
        System.out.println("R.string.app_name: " + R.string.app_name);
        System.out.println("R.string.mcdd_rose = " + R.string.mcdd_rose);

        System.out.println("R.id.layout_main = " + R.id.layout_main);

        System.out.println("R.color.black = " + R.color.black);

        System.out.println("R.drawable.mcdd_01 = " + R.drawable.mcdd_01);

        System.out.println("R.layout.activity_main = " + R.layout.activity_main);
    }
```

# 二、线性布局

## 2.1 概述

## 2.2 Demo

```java
    @Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:tools="http://schemas.android.com/tools"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/layout_main"
            tools:context=".MainActivity">

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

        <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="130dp"
                android:orientation="horizontal">

            <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent"
                    android:gravity="center"
                    android:layout_weight="1"
                    android:text="@string/red"
                    android:textSize="25sp"
                    android:background="#DD4D4D">
            </TextView>

            <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent"
                    android:gravity="center"
                    android:layout_weight="2"
                    android:text="@string/green"
                    android:textSize="25sp"
                    android:background="#4DAC51">
            </TextView>

            <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="match_parent"
                    android:gravity="center"
                    android:layout_weight="3"
                    android:text="@string/blue"
                    android:textSize="25sp"
                    android:background="#1B1B71">
            </TextView>

        </LinearLayout>


        <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center_horizontal"
                android:orientation="vertical">

            <ImageView
                    android:layout_width="150dp"
                    android:layout_height="150dp"
                    android:scaleType="fitCenter"
                    android:padding="3dp"
                    android:src="@drawable/mcdd_01"
                    android:contentDescription="@string/mcdd_strange">
            </ImageView>

            <ImageView
                    android:layout_width="150dp"
                    android:layout_height="150dp"
                    android:scaleType="fitCenter"
                    android:padding="3dp"
                    android:src="@drawable/mcdd_02"
                    android:contentDescription="@string/mcdd_cb">
            </ImageView>

            <ImageView
                    android:layout_width="150dp"
                    android:layout_height="150dp"
                    android:scaleType="fitCenter"
                    android:padding="3dp"
                    android:src="@drawable/mcdd_03"
                    android:contentDescription="@string/mcdd_cbq">
            </ImageView>

            <ImageView
                    android:layout_width="150dp"
                    android:layout_height="150dp"
                    android:scaleType="fitCenter"
                    android:padding="3dp"
                    android:src="@drawable/mcdd_04"
                    android:contentDescription="@string/mcdd_rose">
            </ImageView>

        </LinearLayout>

    </LinearLayout>


</ScrollView>

```


