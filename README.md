# RGB-D Salient Object Detection

- Extracted salient regions from RGB-D images through a cascaded refinement mechanism called the Bifurcated
Backbone Strategy Network (BBS-Net).

- Produced the initial and final saliency map through two cascaded decoders. Obtained mean absolute error of 3%
between the final saliency maps and the ground truth.

- Synthesized new images using styleGAN and RGB-D GAN from 7 RGB-D salient object benchmark datasets.
