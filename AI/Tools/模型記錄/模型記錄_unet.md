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


---

- [回模型記錄](../模型記錄.md)
- [回主目錄](../../index.md)
