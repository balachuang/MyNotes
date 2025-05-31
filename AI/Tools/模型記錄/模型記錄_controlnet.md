## ControlNet

### Flux 專屬高清放大 ControlNet 模型
- 參考不同的地方有不同的說明:
  - https://blog.csdn.net/m0_56144365/article/details/142913680
    - 這裡的說明是只要下載 `Flux.1-dev-Controlnet-Upscaler`
    - 下載的方法是直接下載這個檔再自己改名就好: `diffusion_pytorch_model.safetensors`
  - https://blog.csdn.net/A2421417624/article/details/142850607
    - 這裡的說明是除了 Flux.1-dev-Controlnet-Upscaler 之外, 還要下載另外兩個 model:
      - `Flux.1-dev-Controlnet-Surface-Normals`
      - `Flux.1-dev-Controlnet-Depth`
    - 參考上一篇下載 safetensors 檔再手動改名, 但是下載完才發現三個檔一模一樣 !!!
  - 最後還是只有用到這個: `Flux.1-dev-Controlnet-Upscaler.safetensors`
  - workflow 用 Flux 生圖的 workflow 來改, 才不會出現一些奇怪的 error --> 沒有 error, 但是跑了超級久, 1 個多小時才 15%
  - 已刪除棄用 --> 直接改用 RealESRGan
- Download: [Hugging Face](https://huggingface.co/collections/jasperai/flux1-dev-controlnets-66f27f9459d760dcafa32e08)

### Shakker-Labs/FLUX.1-dev-ControlNet-Union-Pro
- Shakker Labs 出版的 Flux 專用 ControlNet 模型, 也可以用在 GGUF 檔型上
- 注意 Apply ControlNet 時間和權限很重要, 填亂有可能無效或是品質崩壞
- Download: [Hugging Face](https://huggingface.co/Shakker-Labs/FLUX.1-dev-ControlNet-Union-Pro/tree/main)
  原始檔名: (`diffusion_pytorch_model.safetensors`)
  自行改名: (`Shakker_Labs_FLUX.1_dev_ControlNet_Union_Pro.safetensors`)


---

- [回模型記錄](../模型記錄.md)
- [回主目錄](../../index.md)
