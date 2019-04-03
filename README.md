# MVPLibrary
![](https://img.shields.io/badge/release-v1.5-green.svg)  ![](https://img.shields.io/badge/%E4%BD%9C%E8%80%85-JJput-brightgreen.svg)

MVP设计模式，提供BaseActivity、BasePresenter等公共基础类。

更新日志查看[**这里**](https://github.com/JJput/MVPLibrary/blob/master/VERSIONLOG.md)。

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
	        implementation 'com.github.JJput:MVPLibrary:v1.0.5'
	}

## 基本使用
MVPLibrary详细定义了V层和P层基础内容。使其V层和P层只通过接口进行通讯。详情可以将项目下载下来，查看其示例，下面也会简单介绍。

### 目录结构

* MainActivity V层。
* MainContract 协议者，主要控制V层和P层之间的接口。
* MainPresente P层。


### V层

V层实现V层接口，主要实现各种界面交互、显示功能。

#### MainActivity


```
public class MainActivity extends BaseActivity<MainContract.Presenter> implements MainContract.View {

    private TextView tvText;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected MainContract.Presenter initInjector() {
        return new MainPresenter();
    }

    @Override
    protected void initView() {
        super.initView();
        tvText = findViewById(R.id.main_tv);
        mPresenter.startRequsetData();
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    public void showText(String text) {
        tvText.setText(text);
    }
}
```

### P层

#### MainPresenter

实现Presenter的接口，主要完成业务逻辑，并将最后结果通过接口返回至V层。


```
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    @Override
    public void startRequsetData() {
        String data = "Hello MVP";
        /**
         * ...
         */
        mView.showText(data);
    }
}

```

### MainContract

定义V层与P层的接口。

```
public interface MainContract {


    interface View extends IView{

        /**
         * 显示Text内容
         * @param text 文本内容
         */
        void showText(String text);

    }

    interface Presenter extends IPresenter {

        /**
         * 开始获取数据
         */
        void startRequsetData();

    }
}

```


