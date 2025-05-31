## UNET

### Flux model
- 黑森林 官方版本 Flux 模型, 說明參考 Flux 區塊
- 已刪除棄用 --> 有了 HyperFlux Unchained 8-Steps 之後就不用這個了
- Download: [Hugging Face](https://huggingface.co/black-forest-labs/FLUX.1-dev/tree/main)
  (`flux1-dev-fp8-e5m2.safetensors`)
- Download: [Hugging Face](https://huggingface.co/Comfy-Org/flux1-schnell/tree/main)
  (`flux1-schnell-fp8.safetensors`)

### Flux model - GGUF
- 已刪除棄用 --> 有了 HyperFlux Unchained 8-Steps 之後就不用這個了
  (`flux1-dev-Q4_K_S.gguf`)
  (`flux1-dev-Q5_K_S.gguf`)

### GGUF: HyperFlux Unchained 8-Steps (Flux Unchained + ByteDance HyperSD LoRA) ![Good](../../star.png)
- 位元組跳動的 FluxUnchained 與 HyperSD LoRA 合併 - 轉換為 GGUF, 可以透過 8 個步驟生成藝術 NSFW 圖像，同時消耗非常低的 VRAM
- 實際檔案約 6.5 G, 和 GGUF K4 差不多
- 好用, 快, NSFW 也沒問題
- Base Model: `Flux.1 D`
- Download: [Civitai](https://civitai.com/models/730604/gguf-hyperflux-unchained-8-steps-flux-unchained-bytedance-hypersd-lora)
  (`fluxunchained-hyp8-Q4_0.gguf`)

### YarvixPA/FLUX.1-Fill-dev-gguf
- Flux Fill model, 用途包含是修改畫面某個區域及圖片擴展
- 實際使用會有 Error:
  - mat1 and mat2 shapes cannot be multiplied (2074x64 and 384x3072)
  - 這個 error 在 google 上找到的都是其他不同的解析度, 原因是主要 model 和 LORA, ControlNet 不匹配導致
  - 找不到這個解析度的問題, 換了各種 clip model 也一樣
  - 評論區有人問, 回覆是: 这种一般是图片跟mask的尺寸不匹配，因为有些内置方法是以64为单位处理数据的，如果你的图片尺寸不是64的倍数，就很有可能出这个错
  - 安裝 [Image Resize for ComfyUI](https://github.com/palant/image-resize-comfyui) 來調整 image size --> 還是失敗
- 反而直接用 HyperFlux Unchained 8-Steps 就成功了, 但是不穩定, 有時會正確生出要的元件, 有時不會
- Download: [Hugging Face](https://huggingface.co/YarvixPA/FLUX.1-Fill-dev-gguf/tree/main)
  (`flux1-fill-dev-Q4_0.gguf`)
- 最後終於在另一個 video 裡找到真正對應的 clip 模型了
  - zer0int/CLIP-GmP-ViT-L-14
    - Download: [Hugging Face](https://huggingface.co/zer0int/CLIP-GmP-ViT-L-14/tree/main)
      (`ViT-L-14-BEST-smooth-GmP-TE-only-HF-format.safetensors`)
      (`ViT-L-14-TEXT-detail-improved-hiT-GmP-TE-only-HF.safetensors`)
    - 根據 Model Card 的說明, 這兩個的差異是一個用在有文字的情形, 另一個用在沒有文字的情形
    - Reference: https://www.youtube.com/watch?v=U4RLjDKrM3E

### ACE++
- 一個可以保留臉部, 其他地方重繪的 Flux 用 Lora model
- Flux Guaidance -> 50; Image Size -> 1024
  - 太慢了, 我的顯卡跑不大動...
  - 重跑一次可以, 但是生出來的都是垃圾
- Download: [Hugging Face](https://huggingface.co/ali-vilab/ACE_Plus/tree/main/portrait)
  (`comfyui_portrait_lora64.safetensors`)
  (`ace_comfyui_portrait_lora64.safetensors` <-- 自行改名>)

---

- [回模型記錄](../模型記錄.md)
- [回主目錄](../../index.md)
