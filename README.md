# Data-Binding-Guide

add plugin in app.gradle

<pre class="brush: java;">
apply plugin: 'com.android.application'
apply plugin: 'com.android.databinding'
</pre>

edit mainactivity.xml layout

<pre class="brush: java;">
 &lt;?xml version="1.0" encoding="utf-8"?&gt;
&lt;layout xmlns:android="http://schemas.android.com/apk/res/android"&gt;
    &lt;data&gt;
        &lt;variable name="user" type="com.example.jarod.databindingguide.User"/&gt;
        &lt;variable name="handlers" type="com.example.jarod.databindingguide.MyHandlers"/&gt;
    &lt;/data&gt;
    &lt;LinearLayout
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent"&gt;
        &lt;TextView android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@{user.firstName}"
            /&gt;

        &lt;TextView android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@{user.lastName}"/&gt;

        &lt;TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@{user.oldName}"/&gt;
    &lt;/LinearLayout&gt;
&lt;/layout&gt;
</pre>

Craete Pojo class dengan nama class User.java
<pre class="brush: java;">
 public class User {
    private final String firstName;
    private final String lastName;
    private final String oldName;
    private boolean data ;

    public User(String firstName, String lastName,String oldName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.oldName = oldName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getOldName() {
        return oldName;
    }

    public String getLastName() {
        return this.lastName;
    }

}
</pre>

Edit Main Class dengan menggunakan biding 
<pre class="brush: java;">
   super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        User user = new User("Test", "User","22 Thn");
        binding.setUser(user);
</pre>
