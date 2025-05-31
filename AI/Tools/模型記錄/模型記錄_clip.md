## Clip

### city96 發佈的 GGUF 版 Flux 模型
- Download: [city96](https://huggingface.co/city96/FLUX.1-dev-gguf/tree/main)
  - PS. 只下載符合我的顯卡的版本 (6G)
  - 檔案放置位置: model/unet
  - File Name:
    - `flux1-dev-Q4_K_S.gguf`
    - `flux1-dev-Q5_K_S.gguf`

### city96 發佈的 GGUF 版 Clip 模型
- Download: [city96](https://huggingface.co/city96/t5-v1_1-xxl-encoder-gguf/tree/main)
  - PS. 只下載 Flux 對應的版本
  - 檔案放置位置: model/clip
  - File Name:
    - `t5-v1_1-xxl-encoder-Q4_K_S.gguf`
    - `t5-v1_1-xxl-encoder-Q5_K_S.gguf`

### zer0int/CLIP-GmP-ViT-L-14
  - 最後終於找到這個 clip model 是可以用在 flux-fill model 上的.
  - 根據 Model Card 的說明, 這兩個的差異是一個用在有文字的情形, 另一個用在沒有文字的情形
  - Download: [Hugging Face](https://huggingface.co/zer0int/CLIP-GmP-ViT-L-14/tree/main)
    (`ViT-L-14-BEST-smooth-GmP-TE-only-HF-format.safetensors`)
    (`ViT-L-14-TEXT-detail-improved-hiT-GmP-TE-only-HF.safetensors`)
  - Reference: https://www.youtube.com/watch?v=U4RLjDKrM3E


---

- [回模型記錄](../模型記錄.md)
- [回主目錄](../../index.md)
