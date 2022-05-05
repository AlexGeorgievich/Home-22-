#### Home-22v1
Запуск тестов
в Jenkins/на локальном стенде -> gradle clean test -DdeviceHost=browserstack

на локальном стенде -> gradle clean test -DdeviceHost=emulation

на реальном устройстве -> gradle clean test -DdeviceHost=real

в директории resources/config в файле credetials.properties 

находятся ключевые параметры на запуск тестов в средах browserstack / emulation / real

user=erwinbrower_YvWuGk
key=s4bKy8BJQkuAaUM47BmV
app=bs://63cbd44925b5b22527afda9b39691c0f30b35f4e
url=http://hub.browserstack.com/wd/hub
appPackage=org.wikipedia.alpha
appActivity=org.wikipedia.main.MainActivity
deviceName=Pixel_4_API_30
deviceNameReal=R58M437X7BD



### Видео прохождения тестов

> К   тесту в отчете прилагается видео.
<p align="center">
  <img title="WiKi" src="src/test/resources/ReportWiki+.gif" >
</p>


:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
