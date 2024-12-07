### 以下是歷次 download Youtube 方法的演進記錄

- 第一代:
  - 用手機 App 下載 (名字忘記了), 方便快速, 但是後來這個 App 失效旦不更新了.
- 第二代:
  - BAT script 呼叫 youtube-dl 下載影片. 一開始 OK, 但是後來速度變超慢.
- 第三代
  - 原來 youtube-dl 已經不維護了, 改用 yt-dlp, 速度超快.
- 第四代
  - 整合 Powershell 及 yt-dlp:
    1. 用 yt-dlp 下載稍後觀看. (無法登入, 要直接下載 cookie 模擬登入)
    2. 用 Powershell script 改檔名. 改檔名的原因如下:
       1. 同一個頻道常會有相同開頭, 不改的話會在播放時連續好幾片都是相同頻道.
       2. 有些頻道喜歡在 Title 中使用特殊符號, 會造成搬到手機時失敗.
  - Related Files:
    - 1_下戴稍後觀看_forCar.bat: 下載影片用 BAT 檔
    - myDownload.conf: yt-dlp 專用的 config 檔
    - 2_影片改名.bat: 影片改名用 BAT 檔
    - 影片改名.ps1: 給 2_影片改名.bat 呼叫用的 Powershell script
- 第五代
  - 由於 Youtube 廣告太多又不給擋, 因此另外新增一個 Powershell script 專門下載回來本機看.
  - 為了在本機播放時可以照下載順序播放, 因此這個 script 的內容如下:
    1. 呼叫 yt-dlp 下載所有檔案
    2. 在檔名前增加目前時間
  - Related Files:
    - 1_下戴稍後觀看_forPlay.bat: 下載影片用 BAT 檔
    - myDownload_LocalPlay.conf: yt-dlp 專用的 config 檔
    - Local_Rename.ps1: 給 1_下戴稍後觀看_forPlay.bat 呼叫用的 Powershell script
- 第六代 (目前使用中)
  - 用來下載影片的 script 越來越多, 決定自己寫一個程式來取代 Powershell script, 功能包含:
    - 根據條件自動判斷播放位置 (車上播放 / 本機播放), 並自動搬到對應目錄.
    - 根據播放位置修改檔名. 除了相容之前的改名條件外, 再新增檔名長度限制.
  - Related Files:
    - D:\MyDownload\youtube\_post_processor\youtube-video-post-processor-1.0.0-SNAPSHOT.jar
- 第七代 (失敗取消)
  - 本來想要改寫前代的程式, 把 download 也加進去, 並且持續執行, 一監測到 cookie 檔出現就開始下載.
  - 後來因為兩個原因取消:
    1. 用 Java Process 啟動 yt-dlp, 當下載檔案多的時候很容易卡住, 一直找不到解法.
    2. 後來想到直接用 Windows 的排程工具來跑原本的 bat 檔案就好. 只是排程工具最多只能每 5 分鐘跑一次. 沒辦法類即時
  - 先把無效的程式壓起來備份就好.
  - Related Files:
    - MyYoutubeProcessor - Useless.7z


### PS

- 所有 Reference 都在 Reference.7z 中 (with d-p- enc.)


---
- [回根目錄](../README.md)
