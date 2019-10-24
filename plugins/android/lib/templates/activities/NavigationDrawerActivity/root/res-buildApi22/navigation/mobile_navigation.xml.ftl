<?xml version="1.0" encoding="utf-8"?>
<navigation xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/mobile_navigation"
    app:startDestination="@+id/nav_home">

    <fragment
        android:id="@+id/nav_home"
        android:name="${packageName}.ui.home.HomeFragment"
        android:label="@string/menu_home"
        tools:layout="@layout/fragment_home" />

    <fragment
        android:id="@+id/nav_gallery"
        android:name="${packageName}.ui.gallery.GalleryFragment"
        android:label="@string/menu_gallery"
        tools:layout="@layout/fragment_gallery" />

    <fragment
        android:id="@+id/nav_slideshow"
        android:name="${packageName}.ui.slideshow.SlideshowFragment"
        android:label="@string/menu_slideshow"
        tools:layout="@layout/fragment_slideshow" />

    <fragment
        android:id="@+id/nav_tools"
        android:name="${packageName}.ui.tools.ToolsFragment"
        android:label="@string/menu_tools"
        tools:layout="@layout/fragment_tools" />

    <fragment
        android:id="@+id/nav_share"
        android:name="${packageName}.ui.share.ShareFragment"
        android:label="@string/menu_share"
        tools:layout="@layout/fragment_share" />

    <fragment
        android:id="@+id/nav_send"
        android:name="${packageName}.ui.send.SendFragment"
        android:label="@string/menu_send"
        tools:layout="@layout/fragment_send" />
</navigation>