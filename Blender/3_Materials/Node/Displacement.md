### Displacement
- 用貼圖產生真實的模型變化, 另一種方法是用 Displacement Modifier
- 運算量大, 要注意 Performance. 如果不需要真的變動模型, 可以用 [Bump](./Bump.md)
- 要先用 Subdivision Surface 把模型面數細分, 才看得出 Displacement 作用
- 要把 Material Properties >> Setting >> Surface >> Displacement 改成 "Displacement and Bump" 才會在 Viewport 裡看到 displacement 的結果
- 連接方式: Image::Color -- High::Displacement::Displacement -- Displacement::Output
- 可以用 [[Node Wrangler]] 快速產生 Displacement 效果
- 

---

- [回上層目錄](../index.md)
