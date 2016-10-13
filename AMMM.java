//activity_main.xml
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="START FRAGMENT ACTIVITY"
        android:id="@+id/button"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="79dp" />
        
//faga.xml

<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="edu.hansung.ait.actionbar.fraga">

    <!-- TODO: Update blank fragment layout -->
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#ffff00"
        >
    </RelativeLayout>

    <TextView
        android:id="@+id/FragA"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_centerInParent="true"
        android:text="@string/hello_blank_fragment" />
</FrameLayout>

//fag.b

<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="edu.hansung.ait.actionbar.fraga">

    <!-- TODO: Update blank fragment layout -->
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#ff5555"
        >
    </RelativeLayout>

    <TextView
        android:id="@+id/FragA"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_centerInParent="true"
        android:text="@string/hello_blank_fragment" />
</FrameLayout>

//fagc.xml
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="edu.hansung.ait.actionbar.fraga">

    <!-- TODO: Update blank fragment layout -->
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#555555"
        >
    </RelativeLayout>

    <TextView
        android:id="@+id/FragA"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_centerInParent="true"
        android:text="@string/hello_blank_fragment" />
</FrameLayout>

//main_menu.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical" android:layout_width="match_parent"
    android:layout_height="match_parent">

</LinearLayout>


//menu-menu_main.xml
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    <item
        android:id="@+id/FragA"
        android:title="FargA"/>
    <item
        android:id="@+id/FargB"
        android:title="Fragb"/>
    <item
        android:id="@+id/FargC"
        android:title="FragC"/>
</menu>

