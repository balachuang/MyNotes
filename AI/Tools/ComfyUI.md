# Local AI 工具開發記錄

## ComfyUI --> 只是一個介面, 支援節點操作. 不過下載的這一版可以完全獨立使用.

### 安裝記錄
- 完全照著這裡做: https://www.freedidi.com/13266.html
- Flux.1 【Lora 真人模型】: https://www.freedidi.com/14643.html

### 特別記錄
- Lora model 位置: {ComfyUI 安裝位置}\ComfyUI\models\loras
- 工作流不用安裝, 直接把 json 檔拉進去就好了.

### 提示詞
## 下面這一段提示詞可以產生一個類亞洲臉孔的美女
This is a high-resolution portrait of a modern style, featuring a young woman.  She is wearing a tight dress printed with English and patterns, the pattern of which resembles a newspaper.  Her hair is black, falling over her shoulders, and she has one hand resting on the back of her head while the other hangs naturally by her side.  Her eyes are fixed on the camera, and her expression is calm.  She appears to be between the ages of 20 and 30, slim in figure, with delicate features, and fair skin.  Her eyes are brown, and her lips are tinted with a subtle shade of red lipstick.  Her hair falls to her shoulders, with a deep brown color, styled in loose waves without bangs.  The background is dark, giving a mysterious feel.

## Node 記錄

- reference: https://www.patreon.com/posts/10ge-bi-bei-jie-102654770

- ComfyUI Manager
  - ComfyUI Workflow 和模型的管理工具
  - https://github.com/ltdrdata/ComfyUI-Manager?tab=readme-ov-file

- Crystools
  - 一個擴充介面工具，可視覺化CPU、RAM、GPU、VRAM、HDD的使用狀態及生成的進度條。
  - https://github.com/crystian/ComfyUI-Crystools

- AnimateDiff
  - https://blog.hinablue.me/comfyui-animatediff-vid2vid-workflow/


## ComfyUI Plugin

### InstantID
- InstantID是中國的團隊做出來的功能，專注在人像的風格轉換上。官方提供 8 种风格: 
  - (No style)
  - Watercolor
  - Film Noir
  - Neon
  - Jungle
  - Mars
  - Vibrant Color
  - Snow
  - Line Art
- 安裝方式:
  - 根據 ComfyUI研究 的說明, 直接用 ComfyUI Manager 安裝, 安裝的是這個: ComfyUI InstantID (Native Support) 作者: cubiq
  - 安裝完後重啟 ComfyUI
- 注意事项:
  - 使用InstantID需安装 InsightFace 模型（所有换脸的插件都需要）
  - 需使用 SDXL 系列模型
  - 顯卡至少要有 12G 記憶體
- Reference
  - [保姆级安装与使用指南](https://blog.csdn.net/A2421417624/article/details/138303412)
  - [ComfyUI研究 - InstantID](https://vocus.cc/article/660abddcfd8978000196a17b)

### ReActor Node for ComfyUI
- 換臉專用, 可以換影片或圖片中的臉, 也可以一次換多個人.
- https://github.com/Gourieff/comfyui-reactor-node
- 安裝方式:
  1. 直接在 ComfyUI 裡用 ComfyUI Manager 找 Reactor 並安裝, 安裝完關掉 ComfyUI. 
  2. 加上兩個系統環境變數: (用 ComfyUI 安裝的路徑)
     - SSL_CERT_FILE = D:\MyDev\practice_AI\ComfyUI_windows_portable\python_embeded\Lib\site-packages\certifi\cacert.pem
     - SSL_CERT_DIR = D:\MyDev\practice_AI\ComfyUI_windows_portable\python_embeded\Lib\site-packages\certifi
  3. 執行: ComfyUI\custom_nodes\comfyui-reactor-node\install.bat
  4. 下載以下的 model:
     - face_yolov8m.pt
       - https://huggingface.co/datasets/Gourieff/ReActor/blob/main/models/detection/bbox/    face_yolov8m.pt
  	   - 存放目錄: ComfyUI\models\ultralytics\bbox
     - sam_***.pth
       - https://huggingface.co/datasets/Gourieff/ReActor/tree/main/models/sams
  	   - 存放目錄: ComfyUI\models\sams
  5. 啟動 ComfyUI, 啟動時會自動下載 reface model
  6. 完成後就可以在 ComfyUI 裡找到 Reactor Face Swap node.

### ComfyUI_IPAdapter_plus
- 針對產生圖片中的某一部分修改
- https://github.com/cubiq/ComfyUI_IPAdapter_plus?tab=readme-ov-file
- Install:
  - 用 ComfyUI Manager 安裝
  - 從 Github 下載 clip_vision 中的 model 改名並放到 clip_vision 目錄下
  - 從 Github 下載 ipadapter 中的 model 並放到 ipadapter 目錄下, 如果沒有 ipadapter 目錄, 可以先手動建立
  - 參考 Github 上的 workflow, 加上自己的圖. KSampler 建議 step 加至少 10 步.
  - https://www.comflowy.com/zh-CN/blog/face-swap
  - https://www.patreon.com/posts/comfyuijiao-xue-97348864




## Special Notes

- 這個地方整理了很多基本 workflow, 很不錯.
  https://github.com/pwillia7/Basic_ComfyUI_Workflows



## [Back](_Start.md)


InsightFace (已安裝)



---

- [回主目錄](./index.md)
