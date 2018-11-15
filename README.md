# MVPLibrary
![](https://img.shields.io/badge/release-v1.0-green.svg)  ![](https://img.shields.io/badge/%E4%BD%9C%E8%80%85-JJput-brightgreen.svg)

MVP设计模式，提供BaseActivity、BasePresenter等公共基础类。


## 引用

在项目build.gradle下添加：

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

app -> build.gradle

	dependencies {
	        implementation 'com.github.JJput:MVPLibrary:v1.0'
	}

## 基本使用
MVPLibrary详细定义了V层和P层基础内容。使其V层和P层只通过接口进行通讯。详情可以将项目下载下来，查看其示例，下面也会简单介绍。

### 1、目录结构

![](https://github.com/JJput/MVPLibrary/blob/master/app/src/main/res/drawable/img1.png?raw=true)


* MainActivity V层。
* MainContract 协议者，主要控制V层和P层之间的接口。
* MainPresente P层。


### V层

V层主要是一个BaseActivity和View接口实习。
使用时，程序猿自己的activity通过继承BaseActivity

    界面
    class BaseActivity<T extends IPresente> extends AppCompatActivity implements IView
    
    实现接口
    interface IView

### P层




