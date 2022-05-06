### 22. Мобильная автоматизация 
 
1) Разрабатываем автотесты с эмулятором Android-устройства и на своем телефоне
2) Настраиваем рабочее место:
- Appium
- Android Studio
- Настраиваем переменные среды
3) Эмулируем Android устройство
4) Подключаем свой телефон
5) Практика. Разрабатываем автотесты с Appium.
6) Теория. Основы Appium.

 

### Запуск тестов
- в Jenkins/на локальном стенде -> gradle clean test -DdeviceHost=browserstack

- на локальном стенде -> gradle clean test -DdeviceHost=emulation

- на реальном устройстве -> gradle clean test -DdeviceHost=real

- в директории resources/config в файле credetials.properties 

находятся ключевые параметры на запуск тестов в средах browserstack / emulation / real

user=erwinb****_YvWuGk

key=s4bKy8BJ*****kuAaUM47BmV

app=bs://63cbd449*****25b5b22527afda9b39691c0f30b35f4e

url=http://hub.browserstack.com/wd/hub

appPackage=org.wikipedia.alpha

appActivity=org.wikipedia.main.MainActivity

устойство элуляции  --   deviceName=Pixel_4_API_30

реальное Samsung S10+  -- deviceNameReal=R58M437X7BD



### Видео прохождения тестов

> К   тесту в отчете прилагается видео.
<p align="center">
  <img title="WiKi" src="src/test/resources/ReportWiki+.gif" >
</p>


:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
