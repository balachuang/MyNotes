## Checkpoint

### Stable Diffusion v1.5 (SD 1.5)
- Stable Diffusion 官方基础模型 1.5 版本, 直接出图效果一般, 需要大量Prompt进行引导, 基本沒人用.
- Download: [Civitai](https://civitai.com/models/62437/v1-5-pruned-emaonly)
  (`v1-5-pruned-emaonly.safetensors`)
- Base Model: `SD 1.5`

### SD XL
- Stable Diffusion 官方基础模型 XL 版本.
  ( 介紹: 
    [_1_](https://chrislee0728.medium.com/stable-diffusion-xl-%E8%AA%AA%E6%98%8E%E5%8F%8A-sdxl1-0-%E5%AE%89%E8%A3%9D%E6%95%99%E5%AD%B8-b2f7648d49ff)
  )
- Download: [Civitai](https://civitai.com/models/101055?modelVersionId=126601)
  ()
- Base Model: `SDXL 1.0`

### AnyOrangeMixXL - Anything + AbyssOrangeMix >> XL
- AnyOrangeMixXL 是 AnyOrangeMix 的 XL-lize 模型, 它是 Anything 系列和 AbyssOrangeMix 系列的合併.
- Download: [Civitai](https://civitai.com/models/365162/anyorangemixxl-anything-abyssorangemix-greatergreater-xl)
  (`v1-5-pruned-emaonly.safetensors`)
- Base Model: `SD 1.5`

### ChilloutMix
- ChilloutMix 模型是畫小姐姐必備的模型
  ( 介紹: 
    [_1_](https://blog.csdn.net/bestpasu/article/details/130674279)
    [_2_](https://blog.256pages.com/best-3-realistic-model-stable-diffusion/)
  )
- Download: [Civitai](https://civitai.com/models/6424/chilloutmix)
  (`chilloutmix_NiPrunedFp32Fix.safetensors`)
- Base Model: `SD 1.5`

### DreamShaper
- Dreamshaper 模型是一款強大的 AI 模型, 可以根據給定的提示生成具有多種特點和風格的圖像, 且生成的圖像質量非常高, 細節豐富, 栩栩如生.
  ( 介紹: 
    [_1_](https://www.toolify.ai/tw/ai-news-tw/%E6%90%B6%E5%85%88%E9%AB%94%E9%A9%97stable-diffusion%E6%9C%80%E9%AB%98%E8%A9%95%E5%83%B9%E7%9A%84ai%E6%A8%A1%E5%9E%8Bdreamshaper%E8%88%87art-and-eros-946115)
  )
- Download: [Civitai](https://civitai.com/models/4384/dreamshaper)
  (`dreamshaper_8.safetensors`)
- Base Model: `SD 1.5`

### Realistic Vision V6.0 B1
- 真實感極高的一個 Checkpoint, 生成出來的圖片就像相片一樣, 適用於生成真人/真實物件/動物/建築. 建議配合 VAE 使用提高質量.
  ( 介紹: 
    [_1_](https://blog.256pages.com/best-3-realistic-model-stable-diffusion/)
    [_2_](https://www.toolify.ai/tw/ai-news-tw/%E8%B6%85%E9%80%BC%E7%9C%9F%E7%9A%84%E6%A8%A1%E5%9E%8B%E4%BD%BF%E7%94%A8realistic-vision-v51%E7%94%9F%E6%88%90%E9%80%BC%E7%9C%9F%E5%9C%96%E7%89%87-2842805)
  )
- Download: [Civitai](https://civitai.com/models/4201?modelVersionId=29460)
  (`realisticVisionV20_v20.safetensors`, `realisticVisionV60B1_v51HyperVAE.safetensors`)
- Base Model: `SD 1.5`

### ChilloutMix
- 以日韓明星為訓練資料，所以出來的圖像都美美的日韓明星樣子, 不需要 VAE
  ( 介紹: 
    [_1_](https://blog.256pages.com/best-3-realistic-model-stable-diffusion/)
  )
- Negative Prompt 方面簡單配合 EasyNegative 就可以使用。
- 覺得重複感太重可以加上 Cute_girl_mix4
- Base Model: `SD 1.5`

### Toon Ame
- No Information
- Download: [Hugging Face](https://huggingface.co/Bruhn/7choma/commit/2a2a39d8acfe3d72f19fc01c127b5383d62ba427)
  (`toonAme_version20.safetensors`)
- Base Model: 

### Hassaku XL (sfw&nsfw)
- Hassaku 的目標是打造一個具有獨特動漫外觀的模特，能夠創作出色的科幻和科幻藝術作品. 目前是 Beta 階段, 建議使用 [Hentai](#hassaku-xl-(hentai)) 版本代替. 建議使用否定提示 "worst quality, low quality, normal quality", 如果需要 NSFW, 也要特別加 nsfw.
- Download: [Civitai](https://civitai.com/models/140272?modelVersionId=155443)
  (`hassakuXLSfwNsfw_betaV06.safetensors`)
- Base Model: `SDXL 1.0`

### Hassaku XL (Hentai)
- PONY
- Download: [Civitai](https://civitai.com/models/376031/hassaku-xl-hentai)
  (`hassakuXLHentai_v13BetterEyesVersion.safetensors`)
- Base Model: `Pony`

### Pony ForAnime
- PONY
- Download: [Civitai](https://civitai.com/models/452433/pony-foranime)
  (`ponyForanime_v01.safetensors`)
- Base Model: `Pony`

### Pony Realism
- 要多一個 CLIP Set Last Layer 節點來設定 CLIP: 2. 有自帶 VAE, 但是下載的圖片是用原本的 sdxl.vae
- https://cvai.cc/34401.html
- Download: [Civitai](https://civitai.com/models/372465/pony-realism?modelVersionId=914390)
  (`ponyRealism_v22MainVAE.safetensors`)
- Base Model: `Pony`
- Usage Tips: `Clip Skip: 2`
- Prompt:
  - Positive: score_9, score_8_up, score_7_up, BREAK, source_real, raw, photo, amateur
  - Negitive: score_1, score_2, score_3, source_western, source_comic, source_furry

### Deliberate_v3
- 為了 Deathia LORA model 下載的
- Download: [Hugging Face](https://huggingface.co/XpucT/Deliberate)
  (`Deliberate_v3.safetensors`)
- Base Model: ``
- Usage Tips: 建議使用 `mj` (放在一開頭), `cozy`, `cinematic` 來提高圖片品質

### ReV Animated v2:REBIRTH
- 這好像是個 deep learning 的演算法.
- https://cloud.baidu.com/article/3237739
- Download: [Civitai](https://civitai.com/models/7371/rev-animated)
  (`revAnimated_v2Rebirth.safetensors`)
- Base Model: `SD 1.5`

### Comfy-Org Flux model
- ComfyUI 官方版本 Flux 模型, 說明參考 Flux 區塊
- 已刪除棄用 --> - 有了 HyperFlux Unchained 8-Steps 之後就不用這個了
- Download: [Hugging Face](https://huggingface.co/Comfy-Org/flux1-dev/tree/main)
  (`flux1-dev-fp8.safetensors`)
  (`flux1-schnell-fp8.safetensors`)


---

- [回模型記錄](../模型記錄.md)
- [回主目錄](../../index.md)
