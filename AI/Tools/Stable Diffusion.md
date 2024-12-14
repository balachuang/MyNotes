# Local AI 工具開發記錄

## Stable Diffusion 模型說明及安裝

### 安裝記錄
1. 下載 Stable Diffusion (直接下載就不用 Git, 不過我是本來就有裝)
2. 安裝 Python. 直接下載安裝包, Stable Diffusion 只能用 3.10.0 版, 裝其他版本會導致安裝 Extension 失敗.
3. 確定 Path 裡有加上 Python/python.exe 和 Python/Script
4. 直接執行 stable-diffusion-webui\webui-user.bat
5. 如果沒問題的話, 執行完就會自己開啟 Chrome 連到 Stable Diffusion 了

### 特別記錄
- 啟動時如果有出現 Error, 可以把 venv 目錄砍掉再重啟, 就會重新安裝所有元件.
- 我有遇到的問題都是因為先裝了元件, 後來又改了 Python 版本導致的. 所以要記得一開始就用 3.10.0 版
- 重要外掛及安裝 URL:
  - 中文化: https://github.com/bluelovers/stable-diffusion-webui-localization-zh_Hant.git
  - prompt-all-in-one: https://github.com/Physton/sd-webui-prompt-all-in-one.git
  - adetailer: https://github.com/Bing-su/adetailer.git
  - freeu: https://github.com/ljleb/sd-webui-freeu.git
  - Tiled Diffusion/Tile VAE: https://github.com/pkuliyi2015/multidiffusion-upscaler-for-automatic1111.git
  - Dynamic prompts: https://github.com/adieyal/sd-dynamic-prompts.git
  - Tag complete: https://github.com/DominikDoom/a1111-sd-webui-tagcomplete.git
  - ControlNet: https://github.com/Mikubill/sd-webui-controlnet.git
  - Openpose editor: https://github.com/huchenlei/sd-webui-openpose-editor.git
  - Ultimate upscale: https://github.com/Coyote-A/ultimate-upscale-for-automatic1111.git
- 用 Git 更新最新的 Stable Diffusion 指令: git rev-parse HEAD
  - 目前版本 Git ID: cf2772fab0af5573da775e7437e6acdca424f26e
- VAE: 變分自編碼器
  - https://blog.csdn.net/a312863063/article/details/87953517
  - https://zh.wikipedia.org/zh-tw/%E5%8F%98%E5%88%86%E8%87%AA%E7%BC%96%E7%A0%81%E5%99%A8
  - https://jianjiesun.medium.com/dl-ml%E7%AD%86%E8%A8%98-12-variational-autoencoder-vae-6d74bf83daa
- xFormers:
  - xFormers是一個庫，它包含了各種 transformer 架構的模型。該庫僅適用於NVIDIA顯卡，其特點是加速圖像生成並降低顯存佔用，但代價是輸出圖像不穩定。

### 提示詞
- 在負向提示詞加入這些詞可以避免兒童不宜的圖: (nsfw), violence, horror
- 這裡講得很好, 還有附文章 link, 裡面有提示詞大全:
  - https://www.youtube.com/watch?v=9Zew5imHUEM&list=PLRcVezuVeMCbPsJ9UTmxWlkfypNBqagVz&index=7
  - PS. 這整個系統講的不錯, 可以從頭到尾看一遍

### 圖生圖

### Model
- 這裡講得很好, 還有附文章 link, 裡面有提示詞大全:
  - https://www.youtube.com/watch?v=9Zew5imHUEM&list=PLRcVezuVeMCbPsJ9UTmxWlkfypNBqagVz&index=7
  - PS. 這整個系統講的不錯, 可以從頭到尾看一遍
- .ckpt: 早期 model 格式; checkpoint 格式
- .safetensors: 較新的 model 格式, 載入更快, 更安全
- Model 名稱通常表示 model 內的訊息, 例如:
  - pruned: 表示有刪減某些內容
  - ema: ema 表示 exponential moving average, 是訓練過程中的一種平均方式.
  - nonema: 表示此模型不使用 ema 訓練
- Model 下載:
  - https://civitai.com/models (C 站)
    - 用 Google Account 登入, account setting 可以打開 show mature content. 記得把 Browseing Level 開到 XXX, 可以顯示很棒的結果.
  - https://huggingface.co
  - https://www.liblibai.com (牆內站, 連不到)
- 常用 Model:
  - 二次元: 
    - [Anything](https://civitai.com/models/9409?modelVersionId=384264) - 以二次元漫画为主打的模型
	- [Hassaku](https://civitai.com/models/140272?modelVersionId=378499) - 擁有明亮、清晰的動漫風格的模型, 非常容易出NSFW的圖像
  - 寫實:
    - [ChilloutMix](https://civitai.com/models/16274?modelVersionId=19219) - 大名鼎鼎的亞洲美女模型
	- [Realistic Vision](https://civitai.com/models/4201?modelVersionId=29460) - 適合人物和動物
	- [Beautiful Realistic Asians](https://civitai.com/models/25494?modelVersionId=63786) - 專注亞洲美女
  - 2.5D:
    - [ReV Animated](https://civitai.com/models/7371?modelVersionId=46846) - 畫質細膩，細節豐富，畫面通透清爽
    - [DreamShaper](https://civitai.com/models/4384/dreamshaper) - 可以打造出很唯美的寫實偏2.5D的圖片

### Lora
- Lora是Low-Rank Adaptation（低秩適應）的縮寫, 是一種在消耗更少記憶體的情況下加速大型模型訓練的訓練方法. lora模型是小型的stable diffusion模型，對checkpoint模型應用較小的更改. 一樣可以從 C 站下載使用.
- Lora 模型下載後放在 {stable-diffusion}\models\Lora 下.
- 使用方法: 在 Lora tab 中選擇要用的 Lora model. 選定後會在提示詞中增加一個用 <xxx> 包住的提示詞. 這個是 Lora 專用的, 不能用其他 [] () 再額外處理.
- 某些 Lora 模型會有特定觸發詞, 要把這些觸發詞填在正向提示詞裡, 才會觸發使用 Lora 模型.
- Model 分類:
  - 角色 Lora: 專用來產生某個特定角色.
  - 風格 Lora: 專用來產生某種特定風格. 如: 水墨畫風格
  - 概念 Lora: 產生某些用提示詞很難描述的概念. 如: 玻璃雕塑材質
  - 姿勢 Lora: 產生特定姿勢
  - 服裝 Lora: 產生特定服裝
  - 物體 Lora: 產生特定物體

### Embeddings
- 指的是一組常用的正負面提示詞 (大多是負向). 一樣可以從 C 站下載使用. 安裝後可以應用在文生圖的時候調整提示詞.
- 使用方法: 在 Embeddings 中選擇要用的 Embeddings model. 選定後會在提示詞中增加一個用 <xxx> 包住的提示詞. 這個是 Embeddings 專用的, 不能用其他 [] () 再額外處理.

### Hypernetwork
- 一種微調技術, 它是一個附加到 stable diffusion 模型的小型神經網絡，用於修改其風格. 是一個比lora更早的模型微調的技術, 目前較少人用. 一樣可以從 C 站下載使用.
- 使用方法: 在 Hypernetwork 中選擇要用的 Hypernetwork model. 選定後會在提示詞中增加一個用 <xxx> 包住的提示詞. 這個是 Hypernetwork 專用的, 不能用其他 [] () 再額外處理.

### Reference
- (C 站) Stable Diffusion Model Download: https://civitai.com/models
- 模型介詔:
  - https://vocus.cc/article/64d112f1fd89780001c81dfc
  - https://zhuanlan.zhihu.com/p/622410028
  - https://www.uisdc.com/47-stable-diffusion-models
- 安裝說明: https://www.pcschool.com.tw/blog/designer/stable-diffusion-installation
- (*) 最新安裝說明: https://www.youtube.com/watch?v=4HCPrO1vrIQ
- 更新方式: https://ivonblog.com/posts/stable-diffusion-webui-how-to-update/
- 安裝 Extension 失敗: https://www.reddit.com/r/StableDiffusion/comments/17z8k86/install_from_url/
- 技術文章: https://medium.com/ai-blog-tw/stable-diffusion-efficient-latent-diffusion-model-80f651ceb88b
- 玩科技的舒: https://www.youtube.com/playlist?list=PLRcVezuVeMCbPsJ9UTmxWlkfypNBqagVz
  - 人體姿勢提示詞大全:
    - https://caovan.com/stable-diffusion-renwuzishiprompttuwenduizhao/.html
	- https://caovan.com/stable-diffusion-jiaoseyifuprompttuwenduizhao/.html#google_vignette
	- https://caovan.com/tuwenduizhaostable-diffusionrenwufaxingtishicidaquan/.html
	- https://caovan.com/tuwenduizhaostable-diffusionrenwubiaoqingtishicidaquan/.html
	- https://caovan.com/tuwenduizhaostable-diffusionxiewapeishitishicidaquan/.html



D:\MyDev\local_AI\stable-diffusion-webui\venv\Scripts\python.exe -m pip install --upgrade pip



---

- [回主目錄](./index.md)

