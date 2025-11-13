# IntelliJ IDEA 解决WARNING: A restricted method in java.lang.System has been called等警告问题

## **WARNING: A restricted method in java.lang.System has been called**



## **WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module**

## **WARNING: Restricted methods will be blocked in a future release unless native access is enabled**

## **介绍：运行程序会出现警告！**

![img](assets/d8441ee5ad094f39891a72b80d924a2e.png)

## **解决方式**

**1.找到run →** **edit configuration（**运行 → 编辑配置**），并点击**

![img](assets/f0c0a070f7f6464cb4162b1d4cd5885a.png)

**2.点击edit configuration（划红线），**

![img](assets/d79ddfa4c41e45f38f86d3e2009e06ff.png)

**3.依次点击 1.application 2.Modify options**

![img](assets/00fa7ec216af45838983eaff43361775.png)

**4.勾选 Add VM options**

![img](assets/644c5568b51d4d959d4e6be2a8095a84.png)

**5.勾选完成后会出现 VM options 这一栏**

![img](assets/40bee308b8b74cdba2fcb139fd7f616d.png)

**6.在 VM options 上输入，之后点击 Apply ，点击 OK**

> --enable-native-access=ALL-UNNAMED
>
> --add-opens java.base/java.lang=ALL-UNNAMED

![img](assets/39de0b8c01cb4cc0b69b0df8a2461f1a.png)

**7.重新运行，警告消失**

![img](assets/712e5c433fd443c59b1672e2ec51dd90.png)