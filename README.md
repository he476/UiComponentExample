# UiComponentExample
# 一、ListView实例：利用SimpleAdapter实现
ListView布局：<br>
![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/lab3_2.JPG)<br>

![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/lab3_3.JPG)<br>
设置适配器及监听器：<br>
![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/lab3_1.JPG)<br>
实验结果：<br>
![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/1.png)<br>

# 二、创建自定义布局的AlertDialog
布局如下：<br>
![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/lab3_2_1.JPG)<br>
![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/lab3_2_2.JPG)<br>
实验结果：<br>
![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/2.png)<br>

# 三、使用XML定义菜单
布局文件如下：<br>
<pre><code>
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/font_group"
        android:orderInCategory="3"
        android:title="字体大小">        <!--设置子菜单-->
        <menu>
            <item
                android:id="@+id/big_size"
                android:title="大">
            </item>
            <item
                android:id="@+id/mid_size"
                android:title="中">
            </item>
            <item
                android:id="@+id/small_size"
                android:title="小">
            </item>
        </menu>
    </item>
    <item
        android:id="@+id/action_toast"
        android:orderInCategory="2"
        android:title="普通菜单项">
    </item>
    <item
        android:id="@+id/action_color"
        android:orderInCategory="1"
        android:title="字体颜色">
        <menu>
            <item
                android:id="@+id/red"
                android:title="红色">

            </item>
            <item
                android:id="@+id/black"
                android:title="黑色">

            </item>

        </menu>
    </item>
</menu>
</code></pre>
<br>
![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/2.png)<br>
![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/3_1.png)<br>
![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/3_2.png)<br>
![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/3_3.png)<br>

# 四、创建上下文操作模式的上下文菜单
menu的XML文件如下：<br>
<pre><code>
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
<item
    android:id="@+id/menu_delete"
    android:title="delete"
    android:icon="@drawable/delete"/>
</menu>
</code></pre>
<br>
![image](https://github.com/he476/UiComponentExample/blob/master/app/src/main/res/images/4.png)<br>

