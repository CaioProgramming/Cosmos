package features.education.ui.resources

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

object PlanetsCompositions {
    @Composable
    fun Mercury(): ImageVector =
        remember {
            ImageVector
                .Builder(
                    name = "Mercury",
                    defaultWidth = 144.dp,
                    defaultHeight = 144.dp,
                    viewportWidth = 144f,
                    viewportHeight = 144f,
                ).apply {
                    group {
                        group {
                            path(
                                fill =
                                    Brush.linearGradient(
                                        start = Offset(108.635f, 36.575f),
                                        end = Offset(-7.22f, 146.225f),
                                        colorStops =
                                            arrayOf(
                                                0f to Color(0xFFE2D8FE),
                                                1f to Color(0xFF836EBE),
                                            ),
                                    ),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(72f, 20f)
                                horizontalLineTo(72f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 123f, 71f)
                                verticalLineTo(71f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 122f)
                                horizontalLineTo(72f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 71f)
                                verticalLineTo(71f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 20f)
                                close()
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC0B1E2)),
                                    fillAlpha = 0.5f,
                                    stroke = null,
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(68.8974f, 89.6442f)
                                    curveTo(66.1458f, 91.0145f, 63.8888f, 89.7722f, 62.4825f, 86.9482f)
                                    curveTo(61.0762f, 84.1241f, 62.1667f, 80.724f, 64.9184f, 79.3537f)
                                    curveTo(67.67f, 77.9835f, 70.7132f, 79.1615f, 72.1195f, 81.9855f)
                                    curveTo(73.5258f, 84.8096f, 71.6491f, 88.2739f, 68.8974f, 89.6442f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFA896D3)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(68.9664f, 87.4827f)
                                    curveTo(67.2285f, 88.3482f, 64.5936f, 87.9021f, 63.7282f, 86.1642f)
                                    curveTo(62.8628f, 84.4263f, 64.0297f, 81.5961f, 65.7676f, 80.7307f)
                                    curveTo(67.5055f, 79.8653f, 69.6806f, 81.0312f, 70.5461f, 82.7691f)
                                    curveTo(71.4115f, 84.5069f, 70.7042f, 86.6173f, 68.9664f, 87.4827f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFA896D3)),
                                    fillAlpha = 0.5f,
                                    stroke = null,
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(77.7862f, 118.779f)
                                    curveTo(75.2527f, 120.041f, 71.0085f, 117.522f, 69.7469f, 114.989f)
                                    curveTo(68.4853f, 112.455f, 70.1864f, 108.329f, 72.7199f, 107.068f)
                                    curveTo(75.2533f, 105.806f, 78.4242f, 107.506f, 79.6858f, 110.039f)
                                    curveTo(80.9475f, 112.573f, 80.3196f, 117.518f, 77.7862f, 118.779f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC0B1E2)),
                                    fillAlpha = 0.6f,
                                    stroke = null,
                                    strokeAlpha = 0.6f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(21.1687f, 133.383f)
                                    curveTo(24.2152f, 134.9f, 29.319f, 131.871f, 30.8361f, 128.824f)
                                    curveTo(32.3532f, 125.778f, 30.3075f, 120.817f, 27.261f, 119.299f)
                                    curveTo(24.2145f, 117.782f, 20.4014f, 119.826f, 18.8843f, 122.873f)
                                    curveTo(17.3672f, 125.919f, 18.1221f, 131.866f, 21.1687f, 133.383f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFA896D3)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(22.9147f, 130.895f)
                                    curveTo(25.1198f, 131.993f, 28.814f, 129.8f, 29.9121f, 127.595f)
                                    curveTo(31.0102f, 125.39f, 29.5295f, 121.799f, 27.3244f, 120.701f)
                                    curveTo(25.1193f, 119.603f, 22.3593f, 121.082f, 21.2612f, 123.287f)
                                    curveTo(20.1631f, 125.492f, 20.7096f, 129.797f, 22.9147f, 130.895f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC0B1E2)),
                                    fillAlpha = 0.5f,
                                    stroke = null,
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(101.707f, 61.1772f)
                                    curveTo(97.7679f, 64.8869f, 95.1983f, 62.5396f, 91.391f, 58.497f)
                                    curveTo(87.5836f, 54.4544f, 85.8244f, 49.5731f, 89.7633f, 45.8634f)
                                    curveTo(93.7023f, 42.1537f, 99.4297f, 42.5894f, 103.237f, 46.632f)
                                    curveTo(107.044f, 50.6746f, 105.646f, 57.4675f, 101.707f, 61.1772f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC0B1E2)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(100.723f, 57.4998f)
                                    curveTo(98.2349f, 59.8428f, 95.2573f, 58.8416f, 92.9143f, 56.3539f)
                                    curveTo(90.5713f, 53.8661f, 89.4076f, 50.0941f, 91.8954f, 47.7511f)
                                    curveTo(94.3831f, 45.4081f, 98.6418f, 46.2653f, 100.985f, 48.753f)
                                    curveTo(103.328f, 51.2408f, 103.21f, 55.1569f, 100.723f, 57.4998f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFE6D7FF)),
                                    fillAlpha = 0.5f,
                                    stroke = null,
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(104.901f, 126.234f)
                                    curveTo(99.5546f, 126.591f, 99.0676f, 123.18f, 98.7013f, 117.693f)
                                    curveTo(98.335f, 112.206f, 100.062f, 107.367f, 105.409f, 107.01f)
                                    curveTo(110.755f, 106.653f, 114.859f, 110.591f, 115.225f, 116.078f)
                                    curveTo(115.592f, 121.565f, 110.247f, 125.878f, 104.901f, 126.234f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC0B1E2)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(106.463f, 122.804f)
                                    curveTo(103.086f, 123.029f, 101.44f, 120.39f, 101.215f, 117.013f)
                                    curveTo(100.989f, 113.637f, 102.474f, 110.021f, 105.85f, 109.795f)
                                    curveTo(109.227f, 109.57f, 111.943f, 112.905f, 112.168f, 116.282f)
                                    curveTo(112.394f, 119.658f, 109.839f, 122.578f, 106.463f, 122.804f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFA896D3)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(41.8445f, 101.889f)
                                    curveTo(40.6472f, 103.016f, 39.214f, 102.535f, 38.0863f, 101.337f)
                                    curveTo(36.9586f, 100.14f, 36.3985f, 98.3242f, 37.5959f, 97.1965f)
                                    curveTo(38.7932f, 96.0688f, 40.843f, 96.4814f, 41.9707f, 97.6788f)
                                    curveTo(43.0984f, 98.8762f, 43.0419f, 100.761f, 41.8445f, 101.889f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFE6D7FF)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(120.979f, 80.3223f)
                                    curveTo(118.368f, 81.4268f, 116.341f, 79.7884f, 115.236f, 77.1769f)
                                    curveTo(114.132f, 74.5654f, 114.315f, 71.2953f, 116.927f, 70.1909f)
                                    curveTo(119.538f, 69.0864f, 122.604f, 70.9825f, 123.708f, 73.594f)
                                    curveTo(124.812f, 76.2055f, 123.591f, 79.2178f, 120.979f, 80.3223f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFE6D7FF)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(126.15f, 64.8098f)
                                    curveTo(123.538f, 65.9143f, 121.511f, 64.276f, 120.407f, 61.6645f)
                                    curveTo(119.302f, 59.053f, 119.486f, 55.7828f, 122.097f, 54.6784f)
                                    curveTo(124.709f, 53.5739f, 127.774f, 55.47f, 128.879f, 58.0815f)
                                    curveTo(129.983f, 60.693f, 128.761f, 63.7054f, 126.15f, 64.8098f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC0B1E2)),
                                    fillAlpha = 0.5f,
                                    stroke = null,
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(41.6624f, 61.8917f)
                                    curveTo(38.6622f, 65.7079f, 39.8602f, 69.596f, 43.7769f, 72.6752f)
                                    curveTo(47.6935f, 75.7544f, 53.3007f, 75.157f, 56.301f, 71.3408f)
                                    curveTo(59.3012f, 67.5246f, 58.4543f, 62.4414f, 54.5377f, 59.3622f)
                                    curveTo(50.621f, 56.283f, 44.6627f, 58.0755f, 41.6624f, 61.8917f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFA896D3)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(45.0272f, 62.4772f)
                                    curveTo(43.1323f, 64.8874f, 42.9782f, 69.1048f, 45.3884f, 70.9996f)
                                    curveTo(47.7987f, 72.8945f, 52.549f, 71.9965f, 54.4439f, 69.5862f)
                                    curveTo(56.3388f, 67.176f, 55.2325f, 63.439f, 52.8223f, 61.5441f)
                                    curveTo(50.4121f, 59.6492f, 46.9221f, 60.0669f, 45.0272f, 62.4772f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFA896D3)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(25.3798f, 67.5783f)
                                    curveTo(24.7965f, 68.3202f, 24.7491f, 69.6183f, 25.491f, 70.2015f)
                                    curveTo(26.2328f, 70.7848f, 27.695f, 70.5084f, 28.2782f, 69.7665f)
                                    curveTo(28.8615f, 69.0246f, 28.521f, 67.8744f, 27.7791f, 67.2911f)
                                    curveTo(27.0372f, 66.7079f, 25.963f, 66.8365f, 25.3798f, 67.5783f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC0B1E2)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(48.2357f, 44.7283f)
                                    curveTo(47.6784f, 45.4372f, 47.6331f, 46.6776f, 48.342f, 47.2349f)
                                    curveTo(49.0509f, 47.7922f, 50.448f, 47.5281f, 51.0053f, 46.8192f)
                                    curveTo(51.5627f, 46.1103f, 51.2373f, 45.0111f, 50.5284f, 44.4538f)
                                    curveTo(49.8195f, 43.8965f, 48.793f, 44.0194f, 48.2357f, 44.7283f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFA896D3)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(27.5524f, 25.7685f)
                                    curveTo(26.995f, 26.4774f, 26.9497f, 27.7178f, 27.6586f, 28.2752f)
                                    curveTo(28.3675f, 28.8325f, 29.7647f, 28.5683f, 30.322f, 27.8594f)
                                    curveTo(30.8793f, 27.1506f, 30.5539f, 26.0514f, 29.8451f, 25.4941f)
                                    curveTo(29.1362f, 24.9368f, 28.1097f, 25.0596f, 27.5524f, 25.7685f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC0B1E2)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(117.859f, 102.845f)
                                    curveTo(117.302f, 103.554f, 117.257f, 104.794f, 117.966f, 105.352f)
                                    curveTo(118.675f, 105.909f, 120.072f, 105.645f, 120.629f, 104.936f)
                                    curveTo(121.186f, 104.227f, 120.861f, 103.128f, 120.152f, 102.57f)
                                    curveTo(119.443f, 102.013f, 118.417f, 102.136f, 117.859f, 102.845f)
                                    close()
                                }
                            }
                            group {
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFE6D7FF)),
                                        fillAlpha = 0.5f,
                                        stroke = null,
                                        strokeAlpha = 0.5f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(91.402f, 77.149f)
                                        curveTo(84.4719f, 80.5459f, 83.506f, 86.9417f, 86.9923f, 94.0541f)
                                        curveTo(90.4785f, 101.167f, 98.9226f, 104.179f, 105.853f, 100.782f)
                                        curveTo(112.783f, 97.3849f, 115.076f, 89.5194f, 111.59f, 82.407f)
                                        curveTo(108.103f, 75.2945f, 98.332f, 73.7522f, 91.402f, 77.149f)
                                        close()
                                    }
                                }
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFC0B1E2)),
                                        fillAlpha = 0.7f,
                                        stroke = null,
                                        strokeAlpha = 0.7f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(95.8178f, 80.3088f)
                                        curveTo(91.4409f, 82.4542f, 88.3111f, 88.389f, 90.4565f, 92.7659f)
                                        curveTo(92.6019f, 97.1427f, 100.026f, 99.1331f, 104.403f, 96.9877f)
                                        curveTo(108.78f, 94.8423f, 109.773f, 88.7262f, 107.627f, 84.3493f)
                                        curveTo(105.482f, 79.9724f, 100.195f, 78.1634f, 95.8178f, 80.3088f)
                                        close()
                                    }
                                }
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFA896D3)),
                                        fillAlpha = 0.7f,
                                        stroke = null,
                                        strokeAlpha = 0.7f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(95.0522f, 84.4809f)
                                        curveTo(92.6124f, 85.6768f, 90.8678f, 88.985f, 92.0637f, 91.4248f)
                                        curveTo(93.2596f, 93.8646f, 97.3979f, 94.9741f, 99.8377f, 93.7782f)
                                        curveTo(102.278f, 92.5823f, 102.831f, 89.173f, 101.635f, 86.7332f)
                                        curveTo(100.439f, 84.2934f, 97.492f, 83.285f, 95.0522f, 84.4809f)
                                        close()
                                    }
                                }
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFC0B1E2)),
                                        fillAlpha = 0.7f,
                                        stroke = null,
                                        strokeAlpha = 0.7f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(85.7791f, 65.7764f)
                                        curveTo(84.1861f, 66.5573f, 83.0469f, 68.7173f, 83.8278f, 70.3104f)
                                        curveTo(84.6086f, 71.9034f, 87.3107f, 72.6278f, 88.9037f, 71.847f)
                                        curveTo(90.4967f, 71.0661f, 90.8582f, 68.8401f, 90.0774f, 67.247f)
                                        curveTo(89.2965f, 65.654f, 87.3721f, 64.9956f, 85.7791f, 65.7764f)
                                        close()
                                    }
                                }
                            }
                            group {
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFE6D7FF)),
                                        fillAlpha = 0.5f,
                                        stroke = null,
                                        strokeAlpha = 0.5f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(79.6109f, 17.329f)
                                        curveTo(78.8705f, 9.1025f, 72.8489f, 5.6876f, 64.4059f, 6.4474f)
                                        curveTo(55.963f, 7.2072f, 49.7188f, 14.492f, 50.4591f, 22.7185f)
                                        curveTo(51.1994f, 30.945f, 58.1814f, 36.2492f, 66.6243f, 35.4894f)
                                        curveTo(75.0673f, 34.7296f, 80.3512f, 25.5554f, 79.6109f, 17.329f)
                                        close()
                                    }
                                }
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFC0B1E2)),
                                        fillAlpha = 0.7f,
                                        stroke = null,
                                        strokeAlpha = 0.7f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(74.7619f, 20.5316f)
                                        curveTo(74.2944f, 15.3359f, 69.5623f, 9.9351f, 64.3666f, 10.4027f)
                                        curveTo(59.171f, 10.8702f, 54.3385f, 17.5269f, 54.8061f, 22.7226f)
                                        curveTo(55.2737f, 27.9183f, 61.0053f, 31.2534f, 66.201f, 30.7858f)
                                        curveTo(71.3966f, 30.3182f, 75.2295f, 25.7272f, 74.7619f, 20.5316f)
                                        close()
                                    }
                                }
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFA896D3)),
                                        fillAlpha = 0.7f,
                                        stroke = null,
                                        strokeAlpha = 0.7f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(70.8861f, 18.1686f)
                                        curveTo(70.6254f, 15.2724f, 67.9876f, 12.2618f, 65.0914f, 12.5224f)
                                        curveTo(62.1952f, 12.7831f, 59.5015f, 16.4937f, 59.7621f, 19.3899f)
                                        curveTo(60.0227f, 22.2861f, 63.2177f, 24.1452f, 66.1139f, 23.8846f)
                                        curveTo(69.0102f, 23.6239f, 71.1467f, 21.0648f, 70.8861f, 18.1686f)
                                        close()
                                    }
                                }
                            }
                            group {
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFE6D7FF)),
                                        fillAlpha = 0.5f,
                                        stroke = null,
                                        strokeAlpha = 0.5f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(38.1564f, 37.8634f)
                                        curveTo(33.7735f, 36.2207f, 30.5505f, 38.457f, 28.8646f, 42.9552f)
                                        curveTo(27.1787f, 47.4534f, 29.365f, 52.4316f, 33.7479f, 54.0743f)
                                        curveTo(38.1308f, 55.7169f, 42.5545f, 53.4543f, 44.2404f, 48.9561f)
                                        curveTo(45.9263f, 44.4579f, 42.5393f, 39.5061f, 38.1564f, 37.8634f)
                                        close()
                                    }
                                }
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFC0B1E2)),
                                        fillAlpha = 0.7f,
                                        stroke = null,
                                        strokeAlpha = 0.7f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(38.6008f, 41.1262f)
                                        curveTo(35.8327f, 40.0887f, 31.9123f, 41.1786f, 30.8748f, 43.9467f)
                                        curveTo(29.8373f, 46.7148f, 32.0497f, 50.8178f, 34.8178f, 51.8552f)
                                        curveTo(37.5859f, 52.8927f, 40.697f, 50.785f, 41.7344f, 48.0168f)
                                        curveTo(42.7719f, 45.2487f, 41.3689f, 42.1637f, 38.6008f, 41.1262f)
                                        close()
                                    }
                                }
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFA896D3)),
                                        fillAlpha = 0.7f,
                                        stroke = null,
                                        strokeAlpha = 0.7f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(36.442f, 42.5251f)
                                        curveTo(34.899f, 41.9467f, 32.7136f, 42.5543f, 32.1353f, 44.0973f)
                                        curveTo(31.557f, 45.6403f, 32.7902f, 47.9274f, 34.3332f, 48.5058f)
                                        curveTo(35.8763f, 49.0841f, 37.6105f, 47.9092f, 38.1888f, 46.3661f)
                                        curveTo(38.7671f, 44.8231f, 37.985f, 43.1034f, 36.442f, 42.5251f)
                                        close()
                                    }
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFE6D7FF)),
                                    fillAlpha = 0.5f,
                                    stroke = null,
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(10.4147f, 86.3661f)
                                    curveTo(10.8632f, 91.5661f, 14.6603f, 93.7381f, 19.9972f, 93.2778f)
                                    curveTo(25.3342f, 92.8175f, 29.297f, 88.2288f, 28.8485f, 83.0288f)
                                    curveTo(28.4f, 77.8287f, 24.0005f, 74.4606f, 18.6635f, 74.9209f)
                                    curveTo(13.3266f, 75.3812f, 9.9662f, 81.166f, 10.4147f, 86.3661f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC0B1E2)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(13.4861f, 84.3534f)
                                    curveTo(13.7694f, 87.6377f, 16.7469f, 91.0615f, 20.0312f, 90.7783f)
                                    curveTo(23.3154f, 90.495f, 26.3847f, 86.2999f, 26.1014f, 83.0157f)
                                    curveTo(25.8181f, 79.7314f, 22.2041f, 77.6106f, 18.9199f, 77.8938f)
                                    curveTo(15.6356f, 78.1771f, 13.2028f, 81.0692f, 13.4861f, 84.3534f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC0B1E2)),
                                    fillAlpha = 0.5f,
                                    stroke = null,
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(89.6679f, 21.5635f)
                                    curveTo(86.4476f, 25.6597f, 87.7336f, 29.833f, 91.9375f, 33.138f)
                                    curveTo(96.1414f, 36.4431f, 102.16f, 35.8018f, 105.38f, 31.7057f)
                                    curveTo(108.601f, 27.6096f, 107.692f, 22.1535f, 103.488f, 18.8484f)
                                    curveTo(99.2837f, 15.5434f, 92.8883f, 17.4674f, 89.6679f, 21.5635f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFA896D3)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(93.2793f, 22.1921f)
                                    curveTo(91.2455f, 24.7791f, 91.0801f, 29.3058f, 93.6671f, 31.3397f)
                                    curveTo(96.2541f, 33.3736f, 101.353f, 32.4097f, 103.387f, 29.8226f)
                                    curveTo(105.421f, 27.2356f, 104.233f, 23.2245f, 101.646f, 21.1906f)
                                    curveTo(99.0592f, 19.1567f, 95.3132f, 19.6051f, 93.2793f, 22.1921f)
                                    close()
                                }
                            }
                            path(
                                fill = SolidColor(Color(0xFFA896D3)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(63.26907f, 94.9525f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.0205f, 96.20107f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60.77193f, 94.9525f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.26907f, 94.9525f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFC0B1E2)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(63.26907f, 58.1196f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.0205f, 59.36817f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60.77193f, 58.1196f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.26907f, 58.1196f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFA896D3)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(48.53037f, 84.3985f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47.2818f, 85.64707f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 46.033229999999996f, 84.3985f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48.53037f, 84.3985f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFC0B1E2)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(60.77207f, 50.8362f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 59.5235f, 52.08477f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58.27493f, 50.8362f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60.77207f, 50.8362f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFA896D3)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(59.10727f, 114.518f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 57.8587f, 115.76657f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56.61013f, 114.518f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 59.10727f, 114.518f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFA896D3)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(94.48347f, 122.421f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 93.2349f, 123.66957000000001f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 91.98633f, 122.421f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 94.48347f, 122.421f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFC0B1E2)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(84.07867f, 91.2067f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 82.8301f, 92.45527f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 81.58153f, 91.2067f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84.07867f, 91.2067f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFC0B1E2)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(77.89457f, 43.4668f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76.646f, 44.71537f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 75.39743f, 43.4668f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 77.89457f, 43.4668f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFC0B1E2)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(65.76617f, 54.1657f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.5176f, 55.41427f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.26903f, 54.1657f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65.76617f, 54.1657f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFA896D3)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(38.297670000000004f, 66.2353f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 37.0491f, 67.48387f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.80053f, 66.2353f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.297670000000004f, 66.2353f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFA896D3)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(115.88257f, 33.1084f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.634f, 34.356970000000004f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 113.38543f, 33.1084f)
                                arcTo(1.24857f, 1.24857f, 0f, isMoreThanHalf = false, isPositiveArc = true, 115.88257f, 33.1084f)
                                close()
                            }
                            group {
                                path(
                                    fill =
                                        Brush.linearGradient(
                                            start = Offset(27.9651f, 88.0423f),
                                            end = Offset(76.5286f, 74.7264f),
                                            colorStops =
                                                arrayOf(
                                                    0f to Color(0xFF705EA9),
                                                    1f to Color(0xFFC4B7EA),
                                                ),
                                        ),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(59.9989f, 2.37674f)
                                    curveTo(22.2418f, 52.3871f, 56.2425f, 124.217f, 118.855f, 126.717f)
                                    lineTo(138.931f, 127.518f)
                                    lineTo(-38.2921f, 126.764f)
                                    lineTo(59.9989f, 2.37674f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFFFFFFF)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(62.2755f, 144.717f)
                                    curveTo(112.136f, 106.763f, 98.7992f, 28.4197f, 39.1884f, 9.1019f)
                                    lineTo(20.0757f, 2.90809f)
                                    lineTo(190.509f, 51.4994f)
                                    lineTo(62.2755f, 144.717f)
                                    close()
                                }
                            }
                        }
                    }
                }.build()
        }

    @Composable
    fun Saturn(): ImageVector =
        remember {
            ImageVector
                .Builder(
                    name = "Group 314",
                    defaultWidth = 171.dp,
                    defaultHeight = 173.dp,
                    viewportWidth = 171f,
                    viewportHeight = 173f,
                ).apply {
                    group {
                        group {
                            path(
                                fill =
                                    Brush.linearGradient(
                                        start = Offset(107.988f, 81.2018f),
                                        end = Offset(35.7939f, 107.312f),
                                        colorStops =
                                            arrayOf(
                                                0f to Color(0xffffbf8a),
                                                1f to Color(0xffb7967e),
                                            ),
                                    ),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(74.9586f, 60.9015f)
                                horizontalLineTo(74.95859999999999f)
                                arcTo(39.1647f, 39.1647f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.1233f, 100.06620000000001f)
                                verticalLineTo(100.06620000000001f)
                                arcTo(
                                    39.1647f,
                                    39.1647f,
                                    0f,
                                    isMoreThanHalf = false,
                                    isPositiveArc = true,
                                    74.95859999999999f,
                                    139.23090000000002f,
                                )
                                horizontalLineTo(74.9586f)
                                arcTo(39.1647f, 39.1647f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.7939f, 100.06620000000001f)
                                verticalLineTo(100.06620000000001f)
                                arcTo(39.1647f, 39.1647f, 0f, isMoreThanHalf = false, isPositiveArc = true, 74.9586f, 60.9015f)
                                close()
                            }
                            group {
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xffe4802f)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.04439f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(0.783083f, 82.0922f)
                                    lineTo(6.56593f, 79.2198f)
                                    curveTo(16.0924f, 74.4879f, 26.2302f, 71.1029f, 36.6886f, 69.1618f)
                                    lineTo(41.3961f, 68.2881f)
                                    curveTo(48.7313f, 66.9267f, 55.8416f, 64.5526f, 62.5231f, 61.2338f)
                                    verticalLineTo(61.2338f)
                                    curveTo(69.2047f, 57.915f, 76.315f, 55.5409f, 83.6502f, 54.1795f)
                                    lineTo(93.0652f, 52.4321f)
                                    curveTo(100.4f, 51.0707f, 107.511f, 48.6966f, 114.192f, 45.3778f)
                                    verticalLineTo(45.3778f)
                                    curveTo(120.874f, 42.059f, 127.984f, 39.6848f, 135.319f, 38.3234f)
                                    lineTo(149.442f, 35.7023f)
                                    curveTo(153.654f, 34.9206f, 157.737f, 33.5573f, 161.573f, 31.6517f)
                                    verticalLineTo(31.6517f)
                                    curveTo(171.1f, 26.9198f, 181.238f, 23.5347f, 191.696f, 21.5937f)
                                    lineTo(196.403f, 20.72f)
                                    curveTo(203.739f, 19.3586f, 210.849f, 16.9845f, 217.531f, 13.6657f)
                                    curveTo(224.212f, 10.3469f, 231.322f, 7.9727f, 238.658f, 6.6114f)
                                    lineTo(248.073f, 4.86396f)
                                    curveTo(255.408f, 3.5026f, 262.518f, 1.1284f, 269.2f, -2.1904f)
                                    curveTo(275.881f, -5.5092f, 282.992f, -7.8833f, 290.327f, -9.2447f)
                                    lineTo(310.798f, -13.0441f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFF120827)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 2.08878f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(2.31506f, 87.0844f)
                                    lineTo(8.09792f, 84.212f)
                                    curveTo(17.6244f, 79.4801f, 27.7622f, 76.0951f, 38.2206f, 74.154f)
                                    lineTo(42.9281f, 73.2803f)
                                    curveTo(50.2632f, 71.919f, 57.3736f, 69.5448f, 64.0551f, 66.226f)
                                    verticalLineTo(66.226f)
                                    curveTo(70.7367f, 62.9072f, 77.847f, 60.5331f, 85.1821f, 59.1717f)
                                    lineTo(94.5972f, 57.4243f)
                                    curveTo(101.932f, 56.0629f, 109.043f, 53.6888f, 115.724f, 50.37f)
                                    verticalLineTo(50.37f)
                                    curveTo(122.406f, 47.0512f, 129.516f, 44.677f, 136.851f, 43.3157f)
                                    lineTo(150.974f, 40.6945f)
                                    curveTo(155.186f, 39.9128f, 159.269f, 38.5496f, 163.105f, 36.6439f)
                                    verticalLineTo(36.6439f)
                                    curveTo(172.632f, 31.912f, 182.77f, 28.527f, 193.228f, 26.5859f)
                                    lineTo(197.935f, 25.7122f)
                                    curveTo(205.271f, 24.3508f, 212.381f, 21.9767f, 219.062f, 18.6579f)
                                    curveTo(225.744f, 15.3391f, 232.854f, 12.965f, 240.19f, 11.6036f)
                                    lineTo(249.605f, 9.85617f)
                                    curveTo(256.94f, 8.4948f, 264.05f, 6.1207f, 270.732f, 2.8018f)
                                    curveTo(277.413f, -0.5169f, 284.524f, -2.8911f, 291.859f, -4.2525f)
                                    lineTo(312.33f, -8.05184f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xffe8b27b)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 4.17757f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(11.1239f, 115.789f)
                                    lineTo(16.9068f, 112.917f)
                                    curveTo(26.4332f, 108.185f, 36.5711f, 104.8f, 47.0294f, 102.859f)
                                    lineTo(51.7369f, 101.985f)
                                    curveTo(59.0721f, 100.624f, 66.1824f, 98.2497f, 72.864f, 94.9309f)
                                    verticalLineTo(94.9309f)
                                    curveTo(79.5455f, 91.6121f, 86.6559f, 89.238f, 93.991f, 87.8766f)
                                    lineTo(103.406f, 86.1292f)
                                    curveTo(110.741f, 84.7678f, 117.852f, 82.3937f, 124.533f, 79.0749f)
                                    verticalLineTo(79.0749f)
                                    curveTo(131.215f, 75.7561f, 138.325f, 73.382f, 145.66f, 72.0206f)
                                    lineTo(159.783f, 69.3995f)
                                    curveTo(163.995f, 68.6178f, 168.077f, 67.2545f, 171.914f, 65.3488f)
                                    verticalLineTo(65.3488f)
                                    curveTo(181.441f, 60.6169f, 191.578f, 57.2319f, 202.037f, 55.2908f)
                                    lineTo(206.744f, 54.4171f)
                                    curveTo(214.079f, 53.0558f, 221.19f, 50.6816f, 227.871f, 47.3628f)
                                    curveTo(234.553f, 44.044f, 241.663f, 41.6699f, 248.998f, 40.3085f)
                                    lineTo(258.413f, 38.5611f)
                                    curveTo(265.749f, 37.1997f, 272.859f, 34.8256f, 279.54f, 31.5068f)
                                    curveTo(286.222f, 28.188f, 293.332f, 25.8138f, 300.667f, 24.4525f)
                                    lineTo(321.139f, 20.6531f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xff6f471e)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 5.48306f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(7.94519f, 105.431f)
                                    lineTo(13.728f, 102.558f)
                                    curveTo(23.2545f, 97.8264f, 33.3924f, 94.4414f, 43.8507f, 92.5003f)
                                    lineTo(48.5582f, 91.6266f)
                                    curveTo(55.8934f, 90.2652f, 63.0037f, 87.8911f, 69.6853f, 84.5723f)
                                    verticalLineTo(84.5723f)
                                    curveTo(76.3668f, 81.2535f, 83.4771f, 78.8794f, 90.8123f, 77.518f)
                                    lineTo(100.227f, 75.7706f)
                                    curveTo(107.562f, 74.4092f, 114.673f, 72.0351f, 121.354f, 68.7163f)
                                    verticalLineTo(68.7163f)
                                    curveTo(128.036f, 65.3975f, 135.146f, 63.0233f, 142.481f, 61.6619f)
                                    lineTo(156.604f, 59.0408f)
                                    curveTo(160.816f, 58.2591f, 164.899f, 56.8959f, 168.735f, 54.9902f)
                                    verticalLineTo(54.9902f)
                                    curveTo(178.262f, 50.2583f, 188.4f, 46.8732f, 198.858f, 44.9322f)
                                    lineTo(203.566f, 44.0585f)
                                    curveTo(210.901f, 42.6971f, 218.011f, 40.323f, 224.693f, 37.0042f)
                                    curveTo(231.374f, 33.6854f, 238.485f, 31.3112f, 245.82f, 29.9499f)
                                    lineTo(255.235f, 28.2025f)
                                    curveTo(262.57f, 26.8411f, 269.68f, 24.4669f, 276.362f, 21.1481f)
                                    curveTo(283.043f, 17.8293f, 290.154f, 15.4552f, 297.489f, 14.0938f)
                                    lineTo(317.96f, 10.2944f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xffdd9144)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.04439f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(17.6349f, 137.006f)
                                    lineTo(23.4177f, 134.134f)
                                    curveTo(32.9442f, 129.402f, 43.082f, 126.017f, 53.5404f, 124.076f)
                                    lineTo(58.2479f, 123.202f)
                                    curveTo(65.5831f, 121.841f, 72.6934f, 119.467f, 79.375f, 116.148f)
                                    verticalLineTo(116.148f)
                                    curveTo(86.0565f, 112.829f, 93.1668f, 110.455f, 100.502f, 109.093f)
                                    lineTo(109.917f, 107.346f)
                                    curveTo(117.252f, 105.985f, 124.363f, 103.61f, 131.044f, 100.292f)
                                    verticalLineTo(100.292f)
                                    curveTo(137.726f, 96.9729f, 144.836f, 94.5988f, 152.171f, 93.2374f)
                                    lineTo(166.294f, 90.6163f)
                                    curveTo(170.506f, 89.8346f, 174.588f, 88.4713f, 178.425f, 86.5656f)
                                    verticalLineTo(86.5656f)
                                    curveTo(187.952f, 81.8337f, 198.089f, 78.4487f, 208.548f, 76.5076f)
                                    lineTo(213.255f, 75.6339f)
                                    curveTo(220.59f, 74.2726f, 227.701f, 71.8984f, 234.382f, 68.5796f)
                                    curveTo(241.064f, 65.2608f, 248.174f, 62.8867f, 255.509f, 61.5253f)
                                    lineTo(264.924f, 59.7779f)
                                    curveTo(272.26f, 58.4165f, 279.37f, 56.0424f, 286.051f, 52.7236f)
                                    curveTo(292.733f, 49.4048f, 299.843f, 47.0306f, 307.178f, 45.6693f)
                                    lineTo(327.65f, 41.8699f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xff37200f)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 2.08878f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(19.5499f, 143.246f)
                                    lineTo(25.3328f, 140.374f)
                                    curveTo(34.8592f, 135.642f, 44.9971f, 132.257f, 55.4554f, 130.316f)
                                    lineTo(60.163f, 129.442f)
                                    curveTo(67.4981f, 128.081f, 74.6084f, 125.707f, 81.29f, 122.388f)
                                    verticalLineTo(122.388f)
                                    curveTo(87.9715f, 119.069f, 95.0819f, 116.695f, 102.417f, 115.334f)
                                    lineTo(111.832f, 113.586f)
                                    curveTo(119.167f, 112.225f, 126.278f, 109.851f, 132.959f, 106.532f)
                                    verticalLineTo(106.532f)
                                    curveTo(139.641f, 103.213f, 146.751f, 100.839f, 154.086f, 99.4776f)
                                    lineTo(168.209f, 96.8565f)
                                    curveTo(172.421f, 96.0748f, 176.504f, 94.7115f, 180.34f, 92.8058f)
                                    verticalLineTo(92.8058f)
                                    curveTo(189.867f, 88.0739f, 200.004f, 84.6889f, 210.463f, 82.7479f)
                                    lineTo(215.17f, 81.8742f)
                                    curveTo(222.505f, 80.5128f, 229.616f, 78.1386f, 236.297f, 74.8199f)
                                    curveTo(242.979f, 71.5011f, 250.089f, 69.1269f, 257.424f, 67.7655f)
                                    lineTo(266.839f, 66.0181f)
                                    curveTo(274.175f, 64.6568f, 281.285f, 62.2826f, 287.966f, 58.9638f)
                                    curveTo(294.648f, 55.645f, 301.758f, 53.2709f, 309.093f, 51.9095f)
                                    lineTo(329.565f, 48.1101f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xff9e631f)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 2.08878f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(16.1029f, 132.014f)
                                    lineTo(21.8858f, 129.142f)
                                    curveTo(31.4122f, 124.41f, 41.5501f, 121.025f, 52.0084f, 119.084f)
                                    lineTo(56.7159f, 118.21f)
                                    curveTo(64.0511f, 116.849f, 71.1614f, 114.475f, 77.843f, 111.156f)
                                    verticalLineTo(111.156f)
                                    curveTo(84.5245f, 107.837f, 91.6349f, 105.463f, 98.97f, 104.101f)
                                    lineTo(108.385f, 102.354f)
                                    curveTo(115.72f, 100.993f, 122.831f, 98.6186f, 129.512f, 95.2998f)
                                    verticalLineTo(95.2998f)
                                    curveTo(136.194f, 91.981f, 143.304f, 89.6068f, 150.639f, 88.2454f)
                                    lineTo(164.762f, 85.6243f)
                                    curveTo(168.974f, 84.8426f, 173.057f, 83.4793f, 176.893f, 81.5737f)
                                    verticalLineTo(81.5737f)
                                    curveTo(186.42f, 76.8418f, 196.557f, 73.4567f, 207.016f, 71.5157f)
                                    lineTo(211.723f, 70.642f)
                                    curveTo(219.058f, 69.2806f, 226.169f, 66.9065f, 232.85f, 63.5877f)
                                    curveTo(239.532f, 60.2689f, 246.642f, 57.8947f, 253.977f, 56.5334f)
                                    lineTo(263.392f, 54.786f)
                                    curveTo(270.728f, 53.4246f, 277.838f, 51.0504f, 284.519f, 47.7316f)
                                    curveTo(291.201f, 44.4128f, 298.311f, 42.0387f, 305.646f, 40.6773f)
                                    lineTo(326.118f, 36.8779f)
                                }
                            }
                            group {
                                path(
                                    fill =
                                        Brush.linearGradient(
                                            start = Offset(44.4344f, 116.424f),
                                            end = Offset(78.3751f, 97.1854f),
                                            colorStops =
                                                arrayOf(
                                                    0f to Color(0xff3c301e),
                                                    1f to Color(0xffb47e47),
                                                ),
                                        ),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(64.5279f, 36.9725f)
                                    curveTo(43.7278f, 79.6338f, 79.439f, 128.088f, 126.346f, 120.849f)
                                    lineTo(141.385f, 118.527f)
                                    lineTo(9.53684f, 143.717f)
                                    lineTo(64.5279f, 36.9725f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xffffe4cd)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(106.327f, 136.023f)
                                    curveTo(129.724f, 94.7285f, 97.0755f, 44.1601f, 49.8112f, 48.4868f)
                                    lineTo(34.6572f, 49.874f)
                                    lineTo(167.81f, 32.8805f)
                                    lineTo(106.327f, 136.023f)
                                    close()
                                }
                            }
                        }
                    }
                    group {
                        path(
                            fill = null,
                            fillAlpha = 0.8f,
                            stroke =
                                Brush.linearGradient(
                                    start = Offset(85.0292f, 82.7637f),
                                    end = Offset(87.6249f, 91.2223f),
                                    colorStops =
                                        arrayOf(
                                            0f to Color(0xff64481d),
                                            1f to Color(0xffffe5cb),
                                        ),
                                ),
                            strokeAlpha = 0.8f,
                            strokeLineWidth = 2.08878f,
                            strokeLineCap = StrokeCap.Butt,
                            strokeLineJoin = StrokeJoin.Miter,
                            strokeLineMiter = 1.0f,
                            pathFillType = PathFillType.NonZero,
                        ) {
                            moveTo(121.518f, 71.5661f)
                            curveTo(144.49f, 65.3676f, 158.147f, 62.6145f, 158.686f, 64.3715f)
                            curveTo(159.468f, 66.9173f, 127.652f, 78.9388f, 87.6249f, 91.2223f)
                            curveTo(47.5976f, 103.506f, 14.5156f, 111.4f, 13.7344f, 108.854f)
                            curveTo(13.1952f, 107.097f, 23.7884f, 102.408f, 46.2834f, 94.6539f)
                        }
                    }
                    group {
                        path(
                            fill = null,
                            fillAlpha = 0.8f,
                            stroke =
                                Brush.linearGradient(
                                    start = Offset(84.6123f, 84.7582f),
                                    end = Offset(86.0738f, 89.5206f),
                                    colorStops =
                                        arrayOf(
                                            0f to Color(0xffff9a47),
                                            1f to Color(0xfff2b37f),
                                        ),
                                ),
                            strokeAlpha = 0.8f,
                            strokeLineWidth = 1.56659f,
                            strokeLineCap = StrokeCap.Butt,
                            strokeLineJoin = StrokeJoin.Miter,
                            strokeLineMiter = 1.0f,
                            pathFillType = PathFillType.NonZero,
                        ) {
                            moveTo(121.853f, 73.3298f)
                            curveTo(142.627f, 67.4698f, 150.659f, 65.4861f, 150.985f, 66.5491f)
                            curveTo(151.458f, 68.0894f, 122.396f, 78.3741f, 86.0738f, 89.5206f)
                            curveTo(49.7513f, 100.667f, 19.923f, 108.454f, 19.4503f, 106.914f)
                            curveTo(19.1241f, 105.851f, 26.3219f, 103.161f, 46.8069f, 96.3598f)
                        }
                    }
                }.build()
        }

    @Composable
    fun Mars(): ImageVector =
        remember {
            ImageVector
                .Builder(
                    name = "Mars",
                    defaultWidth = 198.dp,
                    defaultHeight = 199.dp,
                    viewportWidth = 198f,
                    viewportHeight = 199f,
                ).apply {
                    group {
                        group {
                            path(
                                fill =
                                    Brush.linearGradient(
                                        start = Offset(135.635f, 63.575f),
                                        end = Offset(19.78f, 173.225f),
                                        colorStops =
                                            arrayOf(
                                                0f to Color(0xFFF3164E),
                                                1f to Color(0xFF8B0119),
                                            ),
                                    ),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(99f, 47f)
                                horizontalLineTo(99f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 150f, 98f)
                                verticalLineTo(98f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 99f, 149f)
                                horizontalLineTo(99f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 98f)
                                verticalLineTo(98f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 99f, 47f)
                                close()
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFE31949)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(109.2f, 77.6239f)
                                    curveTo(105.807f, 79.3139f, 103.023f, 77.7818f, 101.288f, 74.2987f)
                                    curveTo(99.554f, 70.8157f, 100.899f, 66.6222f, 104.293f, 64.9322f)
                                    curveTo(107.687f, 63.2422f, 111.44f, 64.695f, 113.174f, 68.1781f)
                                    curveTo(114.909f, 71.6611f, 112.594f, 75.9339f, 109.2f, 77.6239f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC60C38)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(109.285f, 74.958f)
                                    curveTo(107.142f, 76.0254f, 103.892f, 75.4752f, 102.825f, 73.3318f)
                                    curveTo(101.758f, 71.1884f, 103.197f, 67.6978f, 105.34f, 66.6304f)
                                    curveTo(107.484f, 65.5631f, 110.166f, 67.001f, 111.234f, 69.1444f)
                                    curveTo(112.301f, 71.2878f, 111.429f, 73.8906f, 109.285f, 74.958f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFE31949)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(147.54f, 97.7854f)
                                    curveTo(142.682f, 102.361f, 139.512f, 99.4657f, 134.817f, 94.4798f)
                                    curveTo(130.121f, 89.4939f, 127.951f, 83.4735f, 132.809f, 78.8982f)
                                    curveTo(137.667f, 74.3228f, 144.731f, 74.8602f, 149.427f, 79.8461f)
                                    curveTo(154.123f, 84.832f, 152.398f, 93.21f, 147.54f, 97.7854f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC60C38)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(146.326f, 93.2499f)
                                    curveTo(143.258f, 96.1396f, 139.585f, 94.9048f, 136.696f, 91.8365f)
                                    curveTo(133.806f, 88.7683f, 132.371f, 84.116f, 135.439f, 81.2263f)
                                    curveTo(138.507f, 78.3366f, 143.76f, 79.3938f, 146.649f, 82.462f)
                                    curveTo(149.539f, 85.5303f, 149.394f, 90.3602f, 146.326f, 93.2499f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFBA1F44)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(73.709f, 147.997f)
                                    curveTo(72.2323f, 149.387f, 70.4646f, 148.793f, 69.0738f, 147.316f)
                                    curveTo(67.6829f, 145.839f, 66.9921f, 143.6f, 68.4689f, 142.209f)
                                    curveTo(69.9457f, 140.819f, 72.4738f, 141.327f, 73.8647f, 142.804f)
                                    curveTo(75.2555f, 144.281f, 75.1858f, 146.606f, 73.709f, 147.997f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFE31949)),
                                    fillAlpha = 0.5f,
                                    stroke = null,
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(73.4844f, 98.6665f)
                                    curveTo(69.784f, 103.373f, 71.2617f, 108.169f, 76.0922f, 111.966f)
                                    curveTo(80.9228f, 115.764f, 87.8384f, 115.027f, 91.5388f, 110.32f)
                                    curveTo(95.2391f, 105.614f, 94.1946f, 99.3444f, 89.364f, 95.5467f)
                                    curveTo(84.5334f, 91.7489f, 77.1847f, 93.9598f, 73.4844f, 98.6665f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC60C38)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(77.6341f, 99.3887f)
                                    curveTo(75.2971f, 102.361f, 75.107f, 107.563f, 78.0797f, 109.9f)
                                    curveTo(81.0523f, 112.237f, 86.9111f, 111.129f, 89.2482f, 108.157f)
                                    curveTo(91.5852f, 105.184f, 90.2209f, 100.575f, 87.2482f, 98.2378f)
                                    curveTo(84.2756f, 95.9008f, 79.9712f, 96.416f, 77.6341f, 99.3887f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFE31949)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(81.5913f, 77.4979f)
                                    curveTo(80.9039f, 78.3722f, 80.848f, 79.902f, 81.7224f, 80.5894f)
                                    curveTo(82.5967f, 81.2768f, 84.3198f, 80.951f, 85.0072f, 80.0767f)
                                    curveTo(85.6946f, 79.2024f, 85.2933f, 77.8468f, 84.419f, 77.1594f)
                                    curveTo(83.5447f, 76.472f, 82.2787f, 76.6236f, 81.5913f, 77.4979f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFE31949)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(56.0815f, 54.114f)
                                    curveTo(55.3942f, 54.9883f, 55.3383f, 56.5181f, 56.2126f, 57.2055f)
                                    curveTo(57.0869f, 57.8929f, 58.8101f, 57.5671f, 59.4974f, 56.6928f)
                                    curveTo(60.1848f, 55.8185f, 59.7835f, 54.4629f, 58.9092f, 53.7755f)
                                    curveTo(58.0349f, 53.0881f, 56.7689f, 53.2397f, 56.0815f, 54.114f)
                                    close()
                                }
                            }
                            group {
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFE31949)),
                                        fillAlpha = 0.8f,
                                        stroke = null,
                                        strokeAlpha = 0.8f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(69.7079f, 73.0555f)
                                        curveTo(66.2939f, 71.7759f, 61.4587f, 73.1201f, 60.1791f, 76.5342f)
                                        curveTo(58.8995f, 79.9482f, 61.6281f, 85.0086f, 65.0422f, 86.2881f)
                                        curveTo(68.4562f, 87.5677f, 72.2932f, 84.9681f, 73.5728f, 81.5541f)
                                        curveTo(74.8523f, 78.14f, 73.122f, 74.3351f, 69.7079f, 73.0555f)
                                        close()
                                    }
                                }
                                group {
                                    path(
                                        fill = SolidColor(Color(0xFFC60C38)),
                                        fillAlpha = 0.8f,
                                        stroke = null,
                                        strokeAlpha = 0.8f,
                                        strokeLineWidth = 1.0f,
                                        strokeLineCap = StrokeCap.Butt,
                                        strokeLineJoin = StrokeJoin.Miter,
                                        strokeLineMiter = 1.0f,
                                        pathFillType = PathFillType.NonZero,
                                    ) {
                                        moveTo(67.0454f, 74.7808f)
                                        curveTo(65.1423f, 74.0675f, 62.447f, 74.8168f, 61.7337f, 76.7199f)
                                        curveTo(61.0204f, 78.623f, 62.5414f, 81.4438f, 64.4445f, 82.1571f)
                                        curveTo(66.3476f, 82.8703f, 68.4865f, 81.4212f, 69.1998f, 79.5181f)
                                        curveTo(69.913f, 77.615f, 68.9485f, 75.4941f, 67.0454f, 74.7808f)
                                        close()
                                    }
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFE31949)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(28.5677f, 109.72f)
                                    curveTo(29.1209f, 116.133f, 33.804f, 118.812f, 40.3863f, 118.244f)
                                    curveTo(46.9685f, 117.676f, 51.8561f, 112.017f, 51.3029f, 105.604f)
                                    curveTo(50.7497f, 99.1901f, 45.3236f, 95.036f, 38.7414f, 95.6037f)
                                    curveTo(32.1591f, 96.1715f, 28.0146f, 103.306f, 28.5677f, 109.72f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC60C38)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(32.3558f, 107.237f)
                                    curveTo(32.7052f, 111.288f, 36.3775f, 115.511f, 40.4281f, 115.161f)
                                    curveTo(44.4788f, 114.812f, 48.2642f, 109.638f, 47.9148f, 105.587f)
                                    curveTo(47.5655f, 101.537f, 43.1081f, 98.9211f, 39.0575f, 99.2704f)
                                    curveTo(35.0069f, 99.6198f, 32.0064f, 103.187f, 32.3558f, 107.237f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFE31949)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(132.692f, 48.928f)
                                    curveTo(128.72f, 53.9799f, 130.306f, 59.127f, 135.491f, 63.2033f)
                                    curveTo(140.676f, 67.2796f, 148.098f, 66.4887f, 152.07f, 61.4368f)
                                    curveTo(156.042f, 56.3848f, 154.921f, 49.6556f, 149.736f, 45.5793f)
                                    curveTo(144.551f, 41.503f, 136.663f, 43.876f, 132.692f, 48.928f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFC60C38)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(137.146f, 49.703f)
                                    curveTo(134.637f, 52.8937f, 134.433f, 58.4767f, 137.624f, 60.9852f)
                                    curveTo(140.815f, 63.4937f, 147.103f, 62.3048f, 149.612f, 59.1141f)
                                    curveTo(152.12f, 55.9234f, 150.656f, 50.9762f, 147.465f, 48.4677f)
                                    curveTo(144.274f, 45.9593f, 139.654f, 46.5123f, 137.146f, 49.703f)
                                    close()
                                }
                            }
                            path(
                                fill = SolidColor(Color(0xFFC60C38)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(100.13282f, 139.442f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 98.5929f, 140.98192f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 97.05298f, 139.442f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100.13282f, 139.442f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFBA1F44)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(81.95482f, 139.18f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80.4149f, 140.71992f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78.87498000000001f, 139.18f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 81.95482f, 139.18f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFE31949)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(97.05301999999999f, 85.0311f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.5131f, 86.57101999999999f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 93.97318f, 85.0311f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 97.05301999999999f, 85.0311f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFE31949)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(125.79791999999999f, 143.325f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124.258f, 144.86491999999998f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 122.71808f, 143.325f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 125.79791999999999f, 143.325f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFE31949)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(118.17092f, 75.9421f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116.631f, 77.48201999999999f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 115.09108f, 75.9421f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 118.17092f, 75.9421f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFE31949)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(103.21292f, 89.1376f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 101.673f, 90.67752f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100.13308f, 89.1376f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.21292f, 89.1376f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFFBA1F44)),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(69.33422f, 104.024f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 67.7943f, 105.56392f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66.25438000000001f, 104.024f)
                                arcTo(1.53992f, 1.53992f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69.33422f, 104.024f)
                                close()
                            }
                            path(
                                fill = null,
                                fillAlpha = 1.0f,
                                stroke = SolidColor(Color(0xFFA60823)),
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 3.40129f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(-251.313f, 137.134f)
                                lineTo(-206.708f, 123.139f)
                                curveTo(-194.371f, 119.268f, -181.14f, 119.292f, -168.817f, 123.207f)
                                lineTo(-143.803f, 131.155f)
                                curveTo(-131.552f, 135.047f, -118.403f, 135.094f, -106.124f, 131.289f)
                                lineTo(-79.3701f, 122.999f)
                                curveTo(-67.1656f, 119.217f, -54.0989f, 119.24f, -41.9078f, 123.065f)
                                lineTo(-16.0234f, 131.186f)
                                curveTo(-3.686f, 135.057f, 9.5443f, 135.033f, 21.8676f, 131.118f)
                                lineTo(47.4405f, 122.993f)
                                curveTo(59.8378f, 119.054f, 73.1511f, 119.054f, 85.5483f, 122.993f)
                                lineTo(111.002f, 131.08f)
                                curveTo(123.399f, 135.019f, 136.713f, 135.019f, 149.11f, 131.08f)
                                lineTo(174.564f, 122.993f)
                                curveTo(186.961f, 119.054f, 200.274f, 119.054f, 212.671f, 122.993f)
                                lineTo(257.179f, 137.134f)
                            }
                            path(
                                fill = null,
                                fillAlpha = 1.0f,
                                stroke = SolidColor(Color(0xFFA60823)),
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 3.40129f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(-261.942f, 149.889f)
                                lineTo(-217.337f, 135.894f)
                                curveTo(-205f, 132.023f, -191.769f, 132.047f, -179.446f, 135.962f)
                                lineTo(-154.432f, 143.91f)
                                curveTo(-142.181f, 147.802f, -129.032f, 147.849f, -116.753f, 144.044f)
                                lineTo(-89.999f, 135.754f)
                                curveTo(-77.7945f, 131.972f, -64.7278f, 131.995f, -52.5367f, 135.82f)
                                lineTo(-26.6523f, 143.941f)
                                curveTo(-14.3149f, 147.812f, -1.0846f, 147.788f, 11.2387f, 143.873f)
                                lineTo(36.8116f, 135.748f)
                                curveTo(49.2089f, 131.809f, 62.5222f, 131.809f, 74.9194f, 135.748f)
                                lineTo(100.373f, 143.835f)
                                curveTo(112.77f, 147.774f, 126.084f, 147.774f, 138.481f, 143.835f)
                                lineTo(163.935f, 135.748f)
                                curveTo(176.332f, 131.809f, 189.645f, 131.809f, 202.042f, 135.748f)
                                lineTo(246.55f, 149.889f)
                            }
                            path(
                                fill = null,
                                fillAlpha = 1.0f,
                                stroke = SolidColor(Color(0xFFA60823)),
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 5.10193f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(-272.571f, 156.266f)
                                lineTo(-227.966f, 142.271f)
                                curveTo(-215.629f, 138.4f, -202.398f, 138.424f, -190.075f, 142.34f)
                                lineTo(-165.061f, 150.287f)
                                curveTo(-152.81f, 154.18f, -139.661f, 154.227f, -127.382f, 150.422f)
                                lineTo(-100.628f, 142.131f)
                                curveTo(-88.4236f, 138.349f, -75.3569f, 138.372f, -63.1658f, 142.197f)
                                lineTo(-37.2815f, 150.319f)
                                curveTo(-24.9441f, 154.19f, -11.7137f, 154.166f, 0.6096f, 150.25f)
                                lineTo(26.1825f, 142.125f)
                                curveTo(38.5797f, 138.186f, 51.893f, 138.186f, 64.2903f, 142.125f)
                                lineTo(89.744f, 150.212f)
                                curveTo(102.141f, 154.151f, 115.455f, 154.151f, 127.852f, 150.212f)
                                lineTo(153.306f, 142.125f)
                                curveTo(165.703f, 138.186f, 179.016f, 138.186f, 191.413f, 142.125f)
                                lineTo(235.921f, 156.266f)
                            }
                            path(
                                fill = null,
                                fillAlpha = 1.0f,
                                stroke = SolidColor(Color(0xFFA60823)),
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.70064f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(-257.691f, 141.386f)
                                lineTo(-213.085f, 127.39f)
                                curveTo(-200.748f, 123.52f, -187.518f, 123.543f, -175.194f, 127.459f)
                                lineTo(-150.181f, 135.406f)
                                curveTo(-137.929f, 139.299f, -124.78f, 139.346f, -112.502f, 135.541f)
                                lineTo(-85.7475f, 127.25f)
                                curveTo(-73.543f, 123.469f, -60.4763f, 123.492f, -48.2852f, 127.317f)
                                lineTo(-22.4009f, 135.438f)
                                curveTo(-10.0635f, 139.309f, 3.1669f, 139.285f, 15.4902f, 135.37f)
                                lineTo(41.0631f, 127.244f)
                                curveTo(53.4603f, 123.305f, 66.7736f, 123.305f, 79.1709f, 127.244f)
                                lineTo(104.625f, 135.332f)
                                curveTo(117.022f, 139.271f, 130.335f, 139.271f, 142.732f, 135.332f)
                                lineTo(168.186f, 127.244f)
                                curveTo(180.583f, 123.305f, 193.897f, 123.305f, 206.294f, 127.244f)
                                lineTo(250.802f, 141.386f)
                            }
                            path(
                                fill = null,
                                fillAlpha = 1.0f,
                                stroke = SolidColor(Color(0xFFA60823)),
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.70064f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(-249.188f, 145.637f)
                                lineTo(-204.582f, 131.642f)
                                curveTo(-192.245f, 127.771f, -179.015f, 127.795f, -166.691f, 131.711f)
                                lineTo(-141.677f, 139.658f)
                                curveTo(-129.426f, 143.551f, -116.277f, 143.598f, -103.998f, 139.793f)
                                lineTo(-77.2444f, 131.502f)
                                curveTo(-65.0398f, 127.72f, -51.9732f, 127.743f, -39.7821f, 131.568f)
                                lineTo(-13.8977f, 139.69f)
                                curveTo(-1.5603f, 143.561f, 11.6701f, 143.537f, 23.9934f, 139.621f)
                                lineTo(49.5663f, 131.496f)
                                curveTo(61.9635f, 127.557f, 75.2768f, 127.557f, 87.6741f, 131.496f)
                                lineTo(113.128f, 139.583f)
                                curveTo(125.525f, 143.522f, 138.838f, 143.522f, 151.236f, 139.583f)
                                lineTo(176.689f, 131.496f)
                                curveTo(189.087f, 127.557f, 202.4f, 127.557f, 214.797f, 131.496f)
                                lineTo(259.305f, 145.637f)
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFF86041B)),
                                    fillAlpha = 0.3f,
                                    stroke = null,
                                    strokeAlpha = 0.3f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(96.0992f, 25.2639f)
                                    curveTo(49.5318f, 86.944f, 91.4662f, 175.534f, 168.69f, 178.618f)
                                    lineTo(193.449f, 179.607f)
                                    lineTo(-25.1275f, 178.676f)
                                    lineTo(96.0992f, 25.2639f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFFF698D)),
                                    fillAlpha = 0.3f,
                                    stroke = null,
                                    strokeAlpha = 0.3f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(98.9069f, 200.819f)
                                    curveTo(160.402f, 154.008f, 143.953f, 57.3844f, 70.4326f, 33.5589f)
                                    lineTo(46.86f, 25.9198f)
                                    lineTo(257.063f, 85.8497f)
                                    lineTo(98.9069f, 200.819f)
                                    close()
                                }
                            }
                        }
                    }
                }.build()
        }

    @Composable
    fun Earth(): ImageVector =
        remember {
            ImageVector
                .Builder(
                    name = "Earth",
                    defaultWidth = 130.dp,
                    defaultHeight = 130.dp,
                    viewportWidth = 130f,
                    viewportHeight = 130f,
                ).apply {
                    group {
                        group {
                            path(
                                fill =
                                    Brush.linearGradient(
                                        start = Offset(40.1695f, 67.0038f),
                                        end = Offset(126.955f, 59.6302f),
                                        colorStops =
                                            arrayOf(
                                                0f to Color(0xFF228EA9),
                                                1f to Color(0xFF02DEFE),
                                            ),
                                    ),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(65f, 14f)
                                horizontalLineTo(65f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 65f)
                                verticalLineTo(65f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65f, 116f)
                                horizontalLineTo(65f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 65f)
                                verticalLineTo(65f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65f, 14f)
                                close()
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFFFFFFF)),
                                    fillAlpha = 0.6f,
                                    stroke = null,
                                    strokeAlpha = 0.6f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(55.8409f, 21.7876f)
                                    lineTo(55.4217f, 22.3376f)
                                    curveTo(54.4101f, 23.6647f, 52.6749f, 24.2148f, 51.0835f, 23.7128f)
                                    curveTo(50.6983f, 23.5913f, 50.2968f, 23.5295f, 49.8929f, 23.5295f)
                                    horizontalLineTo(46.4355f)
                                    curveTo(45.3678f, 23.5295f, 44.3646f, 24.0406f, 43.737f, 24.9044f)
                                    curveTo(42.6525f, 26.3972f, 42.9861f, 28.4869f, 44.4814f, 29.5679f)
                                    lineTo(46.3003f, 30.8829f)
                                    curveTo(47.5064f, 31.7548f, 49.011f, 32.1082f, 50.4792f, 31.8645f)
                                    lineTo(53.5454f, 31.3554f)
                                    curveTo(54.066f, 31.269f, 54.5761f, 31.1278f, 55.0671f, 30.9342f)
                                    curveTo(57.7732f, 29.8672f, 60.8523f, 30.4624f, 62.9659f, 32.461f)
                                    lineTo(65.7956f, 35.1369f)
                                    curveTo(66.3053f, 35.619f, 66.8581f, 36.0533f, 67.447f, 36.4347f)
                                    curveTo(72.5733f, 39.7541f, 79.4001f, 38.4888f, 82.9963f, 33.5527f)
                                    lineTo(84.6919f, 31.2254f)
                                    curveTo(85.6363f, 29.9291f, 85.9752f, 28.2882f, 85.6216f, 26.7237f)
                                    lineTo(85.0255f, 24.0864f)
                                    curveTo(84.6303f, 22.3378f, 82.8268f, 21.2989f, 81.1159f, 21.8341f)
                                    curveTo(80.4838f, 22.0318f, 79.9327f, 22.4287f, 79.5448f, 22.9656f)
                                    lineTo(79.3687f, 23.2093f)
                                    curveTo(78.3535f, 24.6142f, 76.5446f, 25.199f, 74.8992f, 24.6541f)
                                    lineTo(63.3822f, 20.8406f)
                                    lineTo(61.4656f, 20.1411f)
                                    curveTo(59.4324f, 19.399f, 57.153f, 20.0663f, 55.8409f, 21.7876f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFFFFF)),
                                    fillAlpha = 0.6f,
                                    stroke = null,
                                    strokeAlpha = 0.6f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(18.8669f, 70.7461f)
                                    lineTo(18.4477f, 71.2961f)
                                    curveTo(17.4361f, 72.6232f, 15.7008f, 73.1733f, 14.1095f, 72.6713f)
                                    lineTo(14.0357f, 72.648f)
                                    curveTo(13.6994f, 72.5419f, 13.3489f, 72.488f, 12.9963f, 72.488f)
                                    horizontalLineTo(11.8837f)
                                    curveTo(9.9316f, 72.488f, 8.6146f, 74.483f, 9.3818f, 76.2781f)
                                    curveTo(10.4438f, 79.138f, 13.3849f, 80.8429f, 16.3944f, 80.3433f)
                                    lineTo(16.6556f, 80.2999f)
                                    curveTo(17.1203f, 80.2228f, 17.5755f, 80.0968f, 18.0137f, 79.924f)
                                    lineTo(18.0931f, 79.8927f)
                                    curveTo(20.7992f, 78.8257f, 23.8783f, 79.4209f, 25.9919f, 81.4195f)
                                    lineTo(28.8216f, 84.0954f)
                                    curveTo(29.3313f, 84.5774f, 29.8841f, 85.0118f, 30.4729f, 85.3931f)
                                    curveTo(35.5993f, 88.7125f, 42.4261f, 87.4472f, 46.0223f, 82.5111f)
                                    lineTo(46.7816f, 81.469f)
                                    curveTo(48.321f, 79.356f, 48.8735f, 76.6814f, 48.2971f, 74.1314f)
                                    curveTo(47.6794f, 71.3983f, 45.8326f, 69.1045f, 43.2944f, 67.9175f)
                                    lineTo(43.1541f, 67.8519f)
                                    curveTo(40.9068f, 66.4407f, 38.153f, 66.0882f, 35.6227f, 66.8876f)
                                    lineTo(28.1198f, 69.2583f)
                                    curveTo(27.01f, 69.6089f, 25.8154f, 69.5827f, 24.722f, 69.1836f)
                                    lineTo(24.4916f, 69.0995f)
                                    curveTo(22.4584f, 68.3575f, 20.179f, 69.0248f, 18.8669f, 70.7461f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFFFFF)),
                                    fillAlpha = 0.6f,
                                    stroke = null,
                                    strokeAlpha = 0.6f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(107.301f, 103.807f)
                                    lineTo(88.8396f, 108.311f)
                                    curveTo(87.4505f, 108.65f, 85.9951f, 108.601f, 84.6316f, 108.171f)
                                    lineTo(83.99f, 107.969f)
                                    curveTo(83.6537f, 107.863f, 83.3032f, 107.809f, 82.9506f, 107.809f)
                                    horizontalLineTo(81.8381f)
                                    curveTo(79.8859f, 107.809f, 78.5689f, 109.804f, 79.3361f, 111.599f)
                                    curveTo(80.3982f, 114.459f, 83.3392f, 116.164f, 86.3488f, 115.664f)
                                    lineTo(87.3089f, 115.505f)
                                    lineTo(103.321f, 114.147f)
                                    curveTo(108.434f, 113.713f, 113.489f, 115.481f, 117.217f, 119.006f)
                                    lineTo(117.651f, 119.416f)
                                    curveTo(118.16f, 119.898f, 118.713f, 120.333f, 119.302f, 120.714f)
                                    curveTo(124.428f, 124.033f, 131.255f, 122.768f, 134.851f, 117.832f)
                                    lineTo(135.611f, 116.79f)
                                    curveTo(137.15f, 114.677f, 137.703f, 112.002f, 137.126f, 109.452f)
                                    curveTo(136.508f, 106.719f, 134.662f, 104.425f, 132.124f, 103.238f)
                                    lineTo(131.983f, 103.173f)
                                    curveTo(129.736f, 101.762f, 126.982f, 101.409f, 124.452f, 102.209f)
                                    lineTo(118.1f, 104.215f)
                                    curveTo(116.244f, 104.802f, 114.246f, 104.758f, 112.417f, 104.091f)
                                    curveTo(110.777f, 103.492f, 108.997f, 103.394f, 107.301f, 103.807f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFF1E819A)),
                                    fillAlpha = 0.4f,
                                    stroke = null,
                                    strokeAlpha = 0.4f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(24.335f, -0.457082f)
                                    curveTo(-17.8568f, 44.7054f, 8.089f, 118.668f, 69.2482f, 127.576f)
                                    lineTo(88.8574f, 130.432f)
                                    lineTo(-84.9026f, 111.421f)
                                    lineTo(24.335f, -0.457082f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFFFFFFF)),
                                    fillAlpha = 0.3f,
                                    stroke = null,
                                    strokeAlpha = 0.3f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(38.5307f, 138.819f)
                                    curveTo(83.4328f, 96.3501f, 62.1075f, 20.9252f, 1.6156f, 8.2551f)
                                    lineTo(-17.7796f, 4.19282f)
                                    lineTo(154.473f, 33.9058f)
                                    lineTo(38.5307f, 138.819f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFA7CF75)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.EvenOdd,
                                ) {
                                    moveTo(-35.0937f, 35.3445f)
                                    lineTo(-30.6791f, 31.3832f)
                                    curveTo(-28.7337f, 29.6375f, -29.868f, 26.411f, -32.4779f, 26.2668f)
                                    curveTo(-33.5192f, 26.2093f, -34.5129f, 26.7085f, -35.0883f, 27.5784f)
                                    lineTo(-35.7139f, 28.524f)
                                    curveTo(-36.049f, 29.0305f, -36.1691f, 29.6494f, -36.0479f, 30.2445f)
                                    lineTo(-35.9711f, 30.6216f)
                                    curveTo(-35.8137f, 31.394f, -36.1844f, 32.1777f, -36.8813f, 32.5461f)
                                    lineTo(-37.0006f, 32.6091f)
                                    curveTo(-38.0221f, 33.149f, -38.2062f, 34.5351f, -37.361f, 35.3229f)
                                    curveTo(-36.7248f, 35.916f, -35.7411f, 35.9254f, -35.0937f, 35.3445f)
                                    close()
                                    moveTo(-37.6411f, 29.9295f)
                                    lineTo(-38.073f, 28.9359f)
                                    curveTo(-38.3861f, 28.2156f, -39.284f, 27.9679f, -39.9222f, 28.4257f)
                                    curveTo(-40.2469f, 28.6586f, -40.4386f, 29.0346f, -40.4363f, 29.4342f)
                                    lineTo(-40.4303f, 30.5176f)
                                    curveTo(-40.4259f, 31.2909f, -39.8175f, 31.9256f, -39.0451f, 31.9627f)
                                    curveTo(-37.9684f, 32.0143f, -37.2114f, 30.9181f, -37.6411f, 29.9295f)
                                    close()
                                    moveTo(-44.1452f, 32.5421f)
                                    lineTo(-43.5105f, 31.6641f)
                                    curveTo(-43.0504f, 31.0276f, -43.2949f, 30.1289f, -44.014f, 29.8131f)
                                    curveTo(-44.38f, 29.6525f, -44.8011f, 29.6792f, -45.1438f, 29.8848f)
                                    lineTo(-46.0728f, 30.4422f)
                                    curveTo(-46.7359f, 30.8401f, -46.9719f, 31.6871f, -46.6101f, 32.3705f)
                                    curveTo(-46.1058f, 33.3232f, -44.7767f, 33.4157f, -44.1452f, 32.5421f)
                                    close()
                                    moveTo(-13.0893f, 77.8971f)
                                    verticalLineTo(77.6069f)
                                    curveTo(-13.0893f, 75.3166f, -12.0084f, 73.1607f, -10.1732f, 71.7905f)
                                    lineTo(-9.42665f, 71.2332f)
                                    curveTo(-7.2751f, 69.627f, -4.525f, 69.0508f, -1.9097f, 69.6584f)
                                    lineTo(-1.24965f, 69.8117f)
                                    lineTo(4.92225f, 71.2395f)
                                    curveTo(5.1229f, 71.286f, 5.3305f, 71.2942f, 5.5342f, 71.2637f)
                                    lineTo(6.71805f, 71.0868f)
                                    curveTo(7.722f, 70.9368f, 8.0454f, 69.6493f, 7.2316f, 69.0426f)
                                    curveTo(6.9426f, 68.8272f, 6.7723f, 68.4879f, 6.7723f, 68.1274f)
                                    verticalLineTo(68.0484f)
                                    curveTo(6.7723f, 67.4407f, 7.1936f, 66.9142f, 7.7865f, 66.781f)
                                    lineTo(9.30203f, 66.4404f)
                                    curveTo(10.2311f, 66.2316f, 10.7527f, 65.2409f, 10.399f, 64.3568f)
                                    curveTo(10.1641f, 63.7695f, 9.5954f, 63.3845f, 8.9629f, 63.3845f)
                                    horizontalLineTo(8.28636f)
                                    curveTo(7.3533f, 63.3845f, 6.4949f, 63.8949f, 6.0494f, 64.7147f)
                                    lineTo(5.65054f, 65.4486f)
                                    curveTo(5.593f, 65.5543f, 5.5279f, 65.6558f, 5.4557f, 65.7521f)
                                    curveTo(4.3998f, 67.1599f, 2.254f, 67.0492f, 1.3486f, 65.5402f)
                                    lineTo(1.19374f, 65.2822f)
                                    curveTo(0.5328f, 64.1805f, -0.8169f, 63.7028f, -2.0237f, 64.1434f)
                                    lineTo(-5.57128f, 65.4386f)
                                    curveTo(-5.878f, 65.5505f, -6.1669f, 65.7065f, -6.4289f, 65.9014f)
                                    lineTo(-8.54958f, 67.4796f)
                                    curveTo(-9.3562f, 68.0799f, -10.5138f, 67.7129f, -10.8273f, 66.7576f)
                                    curveTo(-11.0466f, 66.0893f, -10.7625f, 65.3592f, -10.1492f, 65.0149f)
                                    lineTo(-9.49888f, 64.6498f)
                                    curveTo(-8.8511f, 64.2861f, -8.4501f, 63.6011f, -8.4501f, 62.8583f)
                                    curveTo(-8.4501f, 62.2156f, -8.1494f, 61.6099f, -7.6373f, 61.2215f)
                                    lineTo(-4.62449f, 58.9359f)
                                    curveTo(-4.3755f, 58.747f, -4.1746f, 58.5022f, -4.0379f, 58.2212f)
                                    curveTo(-3.6467f, 57.4172f, -2.7673f, 56.9728f, -1.888f, 57.135f)
                                    lineTo(-0.437825f, 57.4026f)
                                    curveTo(0.7762f, 57.6265f, 1.9953f, 57.0376f, 2.5745f, 55.9474f)
                                    lineTo(2.87072f, 55.3897f)
                                    curveTo(3.1058f, 54.9471f, 3.1168f, 54.4192f, 2.9004f, 53.9672f)
                                    curveTo(2.3509f, 52.8197f, 0.7392f, 52.7603f, 0.1067f, 53.8644f)
                                    lineTo(-0.424107f, 54.7911f)
                                    curveTo(-0.8401f, 55.5173f, -1.8324f, 55.6496f, -2.4241f, 55.0579f)
                                    lineTo(-2.49581f, 54.9862f)
                                    curveTo(-2.6881f, 54.7939f, -2.9488f, 54.6859f, -3.2207f, 54.6859f)
                                    curveTo(-3.7868f, 54.6859f, -4.2458f, 54.227f, -4.2458f, 53.6608f)
                                    verticalLineTo(52.0909f)
                                    curveTo(-4.2458f, 51.5473f, -4.0751f, 51.0174f, -3.7578f, 50.576f)
                                    lineTo(-1.19399f, 47.01f)
                                    curveTo(0.1783f, 45.1013f, 2.5596f, 44.1992f, 4.8521f, 44.7194f)
                                    lineTo(7.23677f, 45.2606f)
                                    curveTo(7.6414f, 45.3525f, 7.9739f, 45.6392f, 8.1243f, 46.0259f)
                                    lineTo(8.14059f, 46.0678f)
                                    curveTo(8.3749f, 46.6703f, 8.0907f, 47.3503f, 7.4973f, 47.6069f)
                                    lineTo(7.17685f, 47.7455f)
                                    curveTo(6.9313f, 47.8517f, 6.7723f, 48.0936f, 6.7723f, 48.3611f)
                                    curveTo(6.7723f, 48.7316f, 7.0726f, 49.0319f, 7.4431f, 49.0319f)
                                    horizontalLineTo(8.22869f)
                                    curveTo(8.9263f, 49.0319f, 9.526f, 48.5372f, 9.6585f, 47.8523f)
                                    lineTo(9.76894f, 47.2818f)
                                    curveTo(9.9178f, 46.5125f, 10.4715f, 45.8842f, 11.216f, 45.6396f)
                                    lineTo(15.144f, 44.3494f)
                                    curveTo(16.0611f, 44.0482f, 16.7417f, 43.2719f, 16.9204f, 42.3234f)
                                    curveTo(17.1241f, 41.2419f, 17.9754f, 40.399f, 19.0589f, 40.2061f)
                                    lineTo(19.4711f, 40.1327f)
                                    curveTo(20.314f, 39.9826f, 21.0638f, 39.5065f, 21.5582f, 38.8074f)
                                    lineTo(25.5152f, 33.2119f)
                                    curveTo(26.4002f, 31.9605f, 27.9425f, 31.3523f, 29.4435f, 31.6628f)
                                    lineTo(29.7676f, 31.7299f)
                                    curveTo(30.662f, 31.915f, 31.4312f, 32.481f, 31.8739f, 33.28f)
                                    curveTo(32.6152f, 34.618f, 34.2141f, 35.2253f, 35.6567f, 34.7169f)
                                    lineTo(36.8187f, 34.3075f)
                                    curveTo(37.7125f, 33.9925f, 38.7009f, 34.0986f, 39.5075f, 34.596f)
                                    curveTo(40.5052f, 35.2112f, 41.7626f, 35.2189f, 42.7676f, 34.6158f)
                                    lineTo(44.2045f, 33.7537f)
                                    curveTo(45.344f, 33.07f, 46.6811f, 32.7917f, 47.9988f, 32.9639f)
                                    lineTo(52.221f, 33.5156f)
                                    curveTo(53.6908f, 33.7077f, 55.185f, 33.4865f, 56.5361f, 32.8769f)
                                    curveTo(57.7792f, 32.3159f, 59.1454f, 32.0831f, 60.5042f, 32.2005f)
                                    lineTo(65.2342f, 32.6093f)
                                    curveTo(65.8664f, 32.6639f, 66.4177f, 33.0612f, 66.6696f, 33.6437f)
                                    curveTo(66.8973f, 34.1703f, 66.8485f, 34.7757f, 66.5392f, 35.259f)
                                    lineTo(66.1839f, 35.814f)
                                    curveTo(65.7398f, 36.508f, 65.6044f, 37.3555f, 65.8103f, 38.1533f)
                                    lineTo(65.9963f, 38.874f)
                                    curveTo(66.1703f, 39.5484f, 66.1914f, 40.2532f, 66.0581f, 40.9368f)
                                    lineTo(65.6894f, 42.8261f)
                                    curveTo(65.5639f, 43.4693f, 65.1137f, 44.0013f, 64.5001f, 44.2313f)
                                    curveTo(63.7115f, 44.5271f, 63.2144f, 45.3097f, 63.282f, 46.1492f)
                                    lineTo(63.7936f, 52.508f)
                                    curveTo(63.8223f, 52.8645f, 63.572f, 53.1831f, 63.2188f, 53.2396f)
                                    curveTo(62.884f, 53.2932f, 62.5603f, 53.0938f, 62.4575f, 52.7706f)
                                    lineTo(61.3689f, 49.3458f)
                                    curveTo(60.775f, 47.4778f, 58.8435f, 46.3815f, 56.9352f, 46.8293f)
                                    curveTo(56.0613f, 47.0344f, 55.2899f, 47.546f, 54.7609f, 48.2712f)
                                    lineTo(54.3318f, 48.8596f)
                                    curveTo(53.2363f, 50.3614f, 52.9395f, 52.3022f, 53.536f, 54.0628f)
                                    lineTo(54.7953f, 57.78f)
                                    curveTo(55.2799f, 59.2104f, 54.9491f, 60.7912f, 53.9316f, 61.9072f)
                                    lineTo(53.201f, 62.7084f)
                                    curveTo(52.8115f, 63.1356f, 52.6378f, 63.717f, 52.7292f, 64.2878f)
                                    lineTo(52.8042f, 64.7568f)
                                    curveTo(52.9781f, 65.8438f, 52.0095f, 66.7682f, 50.9318f, 66.5437f)
                                    curveTo(49.8085f, 66.3097f, 48.8212f, 67.3192f, 49.0802f, 68.4371f)
                                    lineTo(49.8296f, 71.6713f)
                                    curveTo(50.1541f, 73.0718f, 49.6366f, 74.5334f, 48.5032f, 75.4177f)
                                    lineTo(47.1639f, 76.4627f)
                                    curveTo(46.4067f, 77.0534f, 45.9641f, 77.9602f, 45.9641f, 78.9205f)
                                    verticalLineTo(80.6396f)
                                    curveTo(45.9641f, 81.4119f, 45.338f, 82.038f, 44.5657f, 82.038f)
                                    horizontalLineTo(43.5812f)
                                    curveTo(43.1715f, 82.038f, 42.8709f, 82.423f, 42.9702f, 82.8205f)
                                    curveTo(43.1375f, 83.4896f, 42.2624f, 83.9021f, 41.8527f, 83.3474f)
                                    lineTo(38.3096f, 78.5506f)
                                    curveTo(37.8109f, 77.8755f, 36.9138f, 77.6313f, 36.1418f, 77.9607f)
                                    lineTo(34.961f, 78.4645f)
                                    curveTo(34.2324f, 78.7754f, 33.6337f, 79.3285f, 33.2661f, 80.0302f)
                                    lineTo(31.5315f, 83.3418f)
                                    curveTo(31.3667f, 83.6563f, 30.9304f, 83.6917f, 30.7171f, 83.4078f)
                                    lineTo(26.8094f, 78.2077f)
                                    curveTo(25.5704f, 76.5589f, 23.8023f, 75.3861f, 21.8015f, 74.8859f)
                                    lineTo(19.5776f, 74.1585f)
                                    curveTo(18.7601f, 73.891f, 18.113f, 74.8745f, 18.6821f, 75.5195f)
                                    curveTo(18.7633f, 75.6114f, 18.8635f, 75.6846f, 18.9758f, 75.7339f)
                                    lineTo(19.0492f, 75.7661f)
                                    curveTo(19.8584f, 76.1214f, 20.0244f, 77.1972f, 19.3598f, 77.7799f)
                                    lineTo(18.3157f, 78.6952f)
                                    curveTo(17.6766f, 79.2555f, 16.762f, 79.3733f, 16.0018f, 78.9932f)
                                    lineTo(15.1016f, 78.5431f)
                                    curveTo(13.6253f, 77.805f, 11.9969f, 79.2286f, 12.5311f, 80.7903f)
                                    curveTo(12.7864f, 81.5366f, 13.4879f, 82.038f, 14.2766f, 82.038f)
                                    horizontalLineTo(14.3271f)
                                    curveTo(15.7093f, 82.038f, 16.6365f, 83.4571f, 16.0813f, 84.7229f)
                                    lineTo(13.8311f, 89.8534f)
                                    curveTo(13.7003f, 90.1516f, 13.5959f, 90.4607f, 13.519f, 90.7772f)
                                    lineTo(12.4878f, 95.0235f)
                                    curveTo(12.1607f, 96.3702f, 11.5479f, 97.6308f, 10.6908f, 98.7198f)
                                    lineTo(6.58364f, 103.939f)
                                    curveTo(5.9399f, 104.757f, 4.9566f, 105.234f, 3.9158f, 105.234f)
                                    curveTo(2.9929f, 105.234f, 2.1098f, 104.858f, 1.4697f, 104.193f)
                                    lineTo(0.560596f, 103.249f)
                                    curveTo(-0.6008f, 102.042f, -1.2496f, 100.432f, -1.2496f, 98.7576f)
                                    verticalLineTo(93.8293f)
                                    lineTo(-1.76114f, 89.6736f)
                                    curveTo(-1.9296f, 88.3048f, -2.5998f, 87.0471f, -3.6419f, 86.1439f)
                                    curveTo(-4.4767f, 85.4204f, -5.5076f, 84.9614f, -6.6038f, 84.8252f)
                                    lineTo(-7.01385f, 84.7743f)
                                    curveTo(-10.4841f, 84.3431f, -13.0893f, 81.394f, -13.0893f, 77.8971f)
                                    close()
                                    moveTo(-40.1303f, 37.6707f)
                                    lineTo(-40.8705f, 38.6961f)
                                    curveTo(-41.6076f, 39.7172f, -43.1607f, 39.6091f, -43.7493f, 38.4958f)
                                    curveTo(-44.1708f, 37.6984f, -43.8956f, 36.7106f, -43.1224f, 36.246f)
                                    lineTo(-42.0384f, 35.5947f)
                                    curveTo(-41.638f, 35.3541f, -41.1457f, 35.3228f, -40.718f, 35.5109f)
                                    curveTo(-39.8793f, 35.8796f, -39.594f, 36.9278f, -40.1303f, 37.6707f)
                                    close()
                                    moveTo(-38.1712f, 39.3049f)
                                    lineTo(-38.9179f, 39.8303f)
                                    curveTo(-39.2368f, 40.0548f, -39.4266f, 40.4204f, -39.4266f, 40.8105f)
                                    curveTo(-39.4266f, 41.2337f, -39.2035f, 41.6255f, -38.8395f, 41.8414f)
                                    lineTo(-36.9967f, 42.9342f)
                                    curveTo(-35.9267f, 43.5687f, -35.2707f, 44.7204f, -35.2707f, 45.9644f)
                                    verticalLineTo(46.1688f)
                                    curveTo(-35.2707f, 46.7128f, -35.1138f, 47.2454f, -34.8188f, 47.7026f)
                                    lineTo(-34.3945f, 48.3602f)
                                    curveTo(-33.805f, 49.2741f, -32.5975f, 49.5567f, -31.6636f, 48.9993f)
                                    curveTo(-30.8828f, 48.5334f, -30.5098f, 47.6029f, -30.7526f, 46.7266f)
                                    lineTo(-31.9943f, 42.2457f)
                                    curveTo(-32.3548f, 40.9448f, -33.2851f, 39.8772f, -34.5244f, 39.342f)
                                    lineTo(-35.2969f, 39.0084f)
                                    curveTo(-36.2414f, 38.6006f, -37.3299f, 38.7129f, -38.1712f, 39.3049f)
                                    close()
                                    moveTo(-21.2614f, 28.4057f)
                                    lineTo(-28.5602f, 32.6867f)
                                    curveTo(-29.1846f, 33.053f, -29.5683f, 33.7227f, -29.5683f, 34.4467f)
                                    curveTo(-29.5683f, 34.9685f, -29.3683f, 35.4705f, -29.0095f, 35.8494f)
                                    lineTo(-27.7353f, 37.1953f)
                                    curveTo(-26.1938f, 38.8234f, -25.5698f, 41.1151f, -26.0731f, 43.2999f)
                                    lineTo(-27.1431f, 47.9446f)
                                    curveTo(-27.3012f, 48.6307f, -27.1335f, 49.3513f, -26.6887f, 49.8971f)
                                    curveTo(-25.9006f, 50.8643f, -24.4816f, 51.0187f, -23.504f, 50.2437f)
                                    lineTo(-18.6447f, 46.3915f)
                                    curveTo(-16.9097f, 45.0161f, -15.7747f, 43.0223f, -15.4777f, 40.8282f)
                                    lineTo(-15.2512f, 39.1545f)
                                    curveTo(-15.1315f, 38.2695f, -14.8896f, 37.4053f, -14.5325f, 36.5867f)
                                    lineTo(-13.6253f, 34.5066f)
                                    curveTo(-13.2746f, 33.7028f, -13.1497f, 32.8185f, -13.2639f, 31.949f)
                                    curveTo(-13.5347f, 29.8863f, -15.097f, 28.2294f, -17.1402f, 27.8378f)
                                    lineTo(-17.53f, 27.7631f)
                                    curveTo(-18.8106f, 27.5176f, -20.1367f, 27.746f, -21.2614f, 28.4057f)
                                    close()
                                    moveTo(-76.1288f, 47.8477f)
                                    curveTo(-76.7971f, 44.2629f, -76.2071f, 36.853f, -69.034f, 33.6933f)
                                    curveTo(-68.885f, 33.6277f, -68.7361f, 33.5585f, -68.5866f, 33.4891f)
                                    lineTo(-68.5866f, 33.4891f)
                                    lineTo(-68.5866f, 33.4891f)
                                    curveTo(-67.9582f, 33.1971f, -67.3209f, 32.9009f, -66.6385f, 32.8516f)
                                    curveTo(-65.2254f, 32.7495f, -63.0263f, 33.5161f, -60.5065f, 36.7184f)
                                    curveTo(-60.4158f, 36.8338f, -60.3296f, 36.9453f, -60.2464f, 37.0532f)
                                    lineTo(-60.2455f, 37.0543f)
                                    lineTo(-60.2453f, 37.0546f)
                                    lineTo(-60.2452f, 37.0547f)
                                    lineTo(-60.2448f, 37.0551f)
                                    lineTo(-60.2442f, 37.056f)
                                    lineTo(-60.2441f, 37.0561f)
                                    lineTo(-60.2441f, 37.0561f)
                                    curveTo(-59.6415f, 37.8365f, -59.1883f, 38.4234f, -58.2195f, 38.8603f)
                                    curveTo(-56.3774f, 39.6909f, -55.1462f, 38.0347f, -53.9093f, 36.3708f)
                                    curveTo(-52.6758f, 34.7116f, -51.4366f, 33.0446f, -49.5802f, 33.8285f)
                                    curveTo(-49.061f, 34.0477f, -48.4199f, 34.4828f, -47.6344f, 35.1909f)
                                    curveTo(-46.8118f, 35.9324f, -46.2192f, 36.8969f, -45.8011f, 37.9223f)
                                    lineTo(-44.915f, 40.0953f)
                                    curveTo(-44.5879f, 40.8974f, -43.955f, 41.5363f, -43.1561f, 41.8709f)
                                    curveTo(-41.0385f, 42.7577f, -40.4771f, 45.4974f, -42.0751f, 47.1457f)
                                    lineTo(-44.0957f, 49.2299f)
                                    curveTo(-45.3772f, 50.5516f, -45.3173f, 52.6698f, -43.9631f, 53.917f)
                                    lineTo(-43.1892f, 54.6299f)
                                    curveTo(-42.0324f, 55.6954f, -40.1844f, 55.4042f, -39.4112f, 54.0346f)
                                    curveTo(-38.5372f, 52.4863f, -36.3539f, 52.3626f, -35.3105f, 53.8022f)
                                    lineTo(-33.6264f, 56.1261f)
                                    curveTo(-32.3169f, 57.9329f, -32.6147f, 60.4426f, -34.3107f, 61.8929f)
                                    lineTo(-44.209f, 70.3571f)
                                    curveTo(-44.7008f, 70.7777f, -44.984f, 71.3925f, -44.984f, 72.0396f)
                                    curveTo(-44.984f, 73.6088f, -46.5715f, 74.6799f, -48.0266f, 74.0924f)
                                    lineTo(-49.0469f, 73.6805f)
                                    curveTo(-50.8248f, 72.9627f, -52.7644f, 74.2714f, -52.7644f, 76.1887f)
                                    curveTo(-52.7644f, 77.1218f, -52.2834f, 77.989f, -51.4919f, 78.4831f)
                                    lineTo(-46.9f, 81.3497f)
                                    curveTo(-45.3104f, 82.3421f, -43.3759f, 82.6178f, -41.5723f, 82.1091f)
                                    curveTo(-39.7743f, 81.602f, -37.8459f, 81.8744f, -36.2588f, 82.8597f)
                                    lineTo(-27.065f, 88.5672f)
                                    curveTo(-24.7929f, 89.9776f, -24.0984f, 92.9651f, -25.5152f, 95.2332f)
                                    lineTo(-34.2239f, 109.174f)
                                    curveTo(-34.694f, 109.927f, -35.0582f, 110.74f, -35.3063f, 111.592f)
                                    lineTo(-35.9851f, 113.922f)
                                    curveTo(-36.244f, 114.811f, -36.2348f, 115.757f, -35.9586f, 116.641f)
                                    lineTo(-35.1415f, 119.256f)
                                    curveTo(-35.017f, 119.654f, -35.1647f, 120.088f, -35.5068f, 120.327f)
                                    curveTo(-35.9742f, 120.654f, -36.622f, 120.503f, -36.8968f, 120.003f)
                                    lineTo(-40.0741f, 114.223f)
                                    curveTo(-40.6321f, 113.208f, -40.9247f, 112.069f, -40.9247f, 110.911f)
                                    verticalLineTo(100.823f)
                                    curveTo(-40.9247f, 98.7347f, -41.7882f, 96.7399f, -43.3105f, 95.3111f)
                                    lineTo(-44.2287f, 94.4493f)
                                    curveTo(-45.5966f, 93.1654f, -46.1899f, 91.2576f, -45.7913f, 89.4244f)
                                    curveTo(-45.3081f, 87.2016f, -46.2869f, 84.9169f, -48.2294f, 83.7333f)
                                    lineTo(-54.6246f, 79.8367f)
                                    curveTo(-55.1177f, 79.5363f, -55.5357f, 79.1274f, -55.8471f, 78.6411f)
                                    lineTo(-60.4189f, 71.5f)
                                    curveTo(-60.6998f, 71.0612f, -61.3741f, 71.2017f, -61.4564f, 71.7161f)
                                    curveTo(-61.5488f, 72.2935f, -62.3487f, 72.3702f, -62.5491f, 71.8209f)
                                    lineTo(-64.424f, 66.6809f)
                                    curveTo(-64.542f, 66.3574f, -64.574f, 66.0088f, -64.5168f, 65.6692f)
                                    lineTo(-63.5156f, 59.7225f)
                                    curveTo(-63.1861f, 57.7655f, -63.467f, 55.7544f, -64.3203f, 53.9625f)
                                    lineTo(-66.8701f, 48.608f)
                                    curveTo(-67.4637f, 47.3614f, -68.7213f, 46.5673f, -70.102f, 46.5673f)
                                    horizontalLineTo(-70.222f)
                                    curveTo(-70.9048f, 46.5673f, -71.5699f, 46.7848f, -72.1207f, 47.1884f)
                                    lineTo(-74.097f, 48.6361f)
                                    curveTo(-74.7744f, 49.1324f, -75.7378f, 48.8616f, -76.0575f, 48.0852f)
                                    curveTo(-76.0894f, 48.0077f, -76.1134f, 47.93f, -76.1288f, 47.8477f)
                                    close()
                                    moveTo(47.5071f, 86.1732f)
                                    lineTo(47.1796f, 86.559f)
                                    curveTo(46.5241f, 87.331f, 46.584f, 88.4801f, 47.3162f, 89.1797f)
                                    lineTo(47.6336f, 89.483f)
                                    curveTo(47.974f, 89.8083f, 48.4664f, 89.9186f, 48.913f, 89.7697f)
                                    curveTo(49.4318f, 89.5968f, 49.7817f, 89.1114f, 49.7817f, 88.5645f)
                                    verticalLineTo(87.0086f)
                                    curveTo(49.7817f, 86.5363f, 49.5237f, 86.1017f, 49.109f, 85.8755f)
                                    curveTo(48.572f, 85.5826f, 47.9031f, 85.7069f, 47.5071f, 86.1732f)
                                    close()
                                    moveTo(47.1721f, 102.13f)
                                    verticalLineTo(103.216f)
                                    curveTo(47.1721f, 105.292f, 48.8544f, 106.974f, 50.9296f, 106.974f)
                                    curveTo(51.3533f, 106.974f, 51.7739f, 106.902f, 52.1737f, 106.762f)
                                    lineTo(52.7823f, 106.548f)
                                    curveTo(53.7757f, 106.2f, 54.8624f, 106.227f, 55.8372f, 106.625f)
                                    curveTo(56.4008f, 106.855f, 56.9092f, 107.202f, 57.3291f, 107.643f)
                                    lineTo(59.0565f, 109.456f)
                                    curveTo(59.4082f, 109.826f, 59.8429f, 110.106f, 60.3245f, 110.274f)
                                    curveTo(61.7566f, 110.773f, 63.3426f, 110.201f, 64.1272f, 108.904f)
                                    lineTo(64.7981f, 107.794f)
                                    curveTo(65.1255f, 107.253f, 65.3429f, 106.652f, 65.4377f, 106.026f)
                                    lineTo(65.8459f, 103.332f)
                                    curveTo(65.9581f, 102.592f, 65.8206f, 101.835f, 65.4552f, 101.181f)
                                    lineTo(62.6662f, 96.192f)
                                    curveTo(62.2875f, 95.5145f, 61.283f, 95.6149f, 61.0459f, 96.354f)
                                    curveTo(60.9281f, 96.7214f, 60.5864f, 96.9706f, 60.2006f, 96.9706f)
                                    horizontalLineTo(59.9624f)
                                    curveTo(59.4742f, 96.9706f, 59.0334f, 96.6782f, 58.8436f, 96.2283f)
                                    lineTo(58.6783f, 95.8365f)
                                    curveTo(58.2412f, 94.8005f, 56.9905f, 94.3883f, 56.0231f, 94.9616f)
                                    lineTo(53.2113f, 96.6278f)
                                    curveTo(52.8276f, 96.8552f, 52.4136f, 97.0269f, 51.9816f, 97.1377f)
                                    lineTo(50.812f, 97.4379f)
                                    curveTo(48.6699f, 97.9876f, 47.1721f, 99.9184f, 47.1721f, 102.13f)
                                    close()
                                    moveTo(40.8895f, 87.7759f)
                                    lineTo(42.3931f, 90.1433f)
                                    curveTo(42.5705f, 90.4225f, 42.8783f, 90.5917f, 43.2092f, 90.5917f)
                                    curveTo(43.7431f, 90.5917f, 44.176f, 90.1589f, 44.176f, 89.6249f)
                                    verticalLineTo(89.5385f)
                                    curveTo(44.176f, 89.2829f, 44.0831f, 89.036f, 43.9145f, 88.8439f)
                                    lineTo(42.1496f, 86.8319f)
                                    curveTo(41.9185f, 86.5684f, 41.5414f, 86.4888f, 41.2235f, 86.6364f)
                                    curveTo(40.7908f, 86.8373f, 40.6337f, 87.3732f, 40.8895f, 87.7759f)
                                    close()
                                    moveTo(13.9475f, 98.2081f)
                                    lineTo(15.479f, 95.8588f)
                                    curveTo(15.7396f, 95.4591f, 16.2923f, 95.38f, 16.6545f, 95.6906f)
                                    curveTo(16.9205f, 95.9188f, 17.0043f, 96.295f, 16.8603f, 96.6145f)
                                    lineTo(15.7604f, 99.0545f)
                                    curveTo(15.6554f, 99.2875f, 15.4692f, 99.4743f, 15.2366f, 99.5802f)
                                    lineTo(15.1579f, 99.616f)
                                    curveTo(14.672f, 99.8373f, 14.0987f, 99.6227f, 13.8774f, 99.1367f)
                                    curveTo(13.7404f, 98.8356f, 13.7668f, 98.4853f, 13.9475f, 98.2081f)
                                    close()
                                    moveTo(60.5747f, 91.7737f)
                                    lineTo(60.7704f, 91.9534f)
                                    curveTo(61.0691f, 92.2275f, 61.4597f, 92.3796f, 61.8651f, 92.3796f)
                                    horizontalLineTo(62.7942f)
                                    curveTo(63.1993f, 92.3796f, 63.5994f, 92.4694f, 63.9656f, 92.6425f)
                                    lineTo(65.4401f, 93.3395f)
                                    curveTo(65.8019f, 93.5106f, 66.2344f, 93.3947f, 66.4622f, 93.0656f)
                                    curveTo(66.723f, 92.6889f, 66.6236f, 92.1716f, 66.2418f, 91.9183f)
                                    lineTo(62.4371f, 89.3944f)
                                    curveTo(62.1888f, 89.2296f, 61.8974f, 89.1418f, 61.5994f, 89.1418f)
                                    curveTo(60.2177f, 89.1418f, 59.5568f, 90.8395f, 60.5747f, 91.7737f)
                                    close()
                                    moveTo(71.72f, 115.599f)
                                    lineTo(69.4924f, 117.484f)
                                    curveTo(69.2378f, 117.699f, 69.1545f, 118.056f, 69.2875f, 118.362f)
                                    curveTo(69.4366f, 118.705f, 69.8139f, 118.887f, 70.1751f, 118.791f)
                                    lineTo(70.8648f, 118.607f)
                                    curveTo(71.3971f, 118.465f, 71.8175f, 118.057f, 71.9751f, 117.529f)
                                    lineTo(72.4156f, 116.054f)
                                    curveTo(72.5391f, 115.641f, 72.0492f, 115.32f, 71.72f, 115.599f)
                                    close()
                                    moveTo(73.5672f, 113.142f)
                                    lineTo(74.4154f, 110.35f)
                                    curveTo(74.5407f, 109.937f, 75.1261f, 109.941f, 75.2467f, 110.355f)
                                    lineTo(75.677f, 111.833f)
                                    curveTo(75.831f, 112.362f, 75.6994f, 112.932f, 75.3293f, 113.341f)
                                    lineTo(74.8498f, 113.869f)
                                    curveTo(74.5987f, 114.146f, 74.1828f, 114.198f, 73.8716f, 113.991f)
                                    curveTo(73.594f, 113.806f, 73.4703f, 113.461f, 73.5672f, 113.142f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFA7CF75)),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.EvenOdd,
                                ) {
                                    moveTo(117.907f, 35.3446f)
                                    lineTo(122.321f, 31.3833f)
                                    curveTo(124.267f, 29.6376f, 123.132f, 26.4112f, 120.522f, 26.267f)
                                    curveTo(119.481f, 26.2094f, 118.487f, 26.7087f, 117.912f, 27.5785f)
                                    lineTo(117.286f, 28.5242f)
                                    curveTo(116.951f, 29.0307f, 116.831f, 29.6495f, 116.952f, 30.2446f)
                                    lineTo(117.029f, 30.6218f)
                                    curveTo(117.187f, 31.3941f, 116.816f, 32.1778f, 116.119f, 32.5462f)
                                    lineTo(116f, 32.6092f)
                                    curveTo(114.978f, 33.1492f, 114.794f, 34.5352f, 115.639f, 35.3231f)
                                    curveTo(116.275f, 35.9162f, 117.259f, 35.9255f, 117.907f, 35.3446f)
                                    close()
                                    moveTo(115.359f, 29.9296f)
                                    lineTo(114.927f, 28.936f)
                                    curveTo(114.614f, 28.2157f, 113.716f, 27.968f, 113.078f, 28.4258f)
                                    curveTo(112.753f, 28.6587f, 112.562f, 29.0347f, 112.564f, 29.4344f)
                                    lineTo(112.57f, 30.5177f)
                                    curveTo(112.574f, 31.291f, 113.183f, 31.9258f, 113.955f, 31.9628f)
                                    curveTo(115.032f, 32.0144f, 115.789f, 30.9182f, 115.359f, 29.9296f)
                                    close()
                                    moveTo(108.855f, 32.5422f)
                                    lineTo(109.49f, 31.6642f)
                                    curveTo(109.95f, 31.0277f, 109.705f, 30.129f, 108.986f, 29.8133f)
                                    curveTo(108.62f, 29.6526f, 108.199f, 29.6793f, 107.856f, 29.8849f)
                                    lineTo(106.927f, 30.4423f)
                                    curveTo(106.264f, 30.8402f, 106.028f, 31.6872f, 106.39f, 32.3706f)
                                    curveTo(106.894f, 33.3233f, 108.223f, 33.4158f, 108.855f, 32.5422f)
                                    close()
                                    moveTo(139.911f, 77.8973f)
                                    verticalLineTo(77.607f)
                                    curveTo(139.911f, 75.3168f, 140.992f, 73.1608f, 142.827f, 71.7907f)
                                    lineTo(143.573f, 71.2333f)
                                    curveTo(145.725f, 69.6271f, 148.475f, 69.0509f, 151.09f, 69.6585f)
                                    lineTo(151.75f, 69.8118f)
                                    lineTo(157.922f, 71.2397f)
                                    curveTo(158.123f, 71.2861f, 158.331f, 71.2943f, 158.534f, 71.2639f)
                                    lineTo(159.718f, 71.087f)
                                    curveTo(160.722f, 70.937f, 161.046f, 69.6494f, 160.232f, 69.0427f)
                                    curveTo(159.943f, 68.8273f, 159.772f, 68.488f, 159.772f, 68.1275f)
                                    verticalLineTo(68.0485f)
                                    curveTo(159.772f, 67.4408f, 160.194f, 66.9143f, 160.787f, 66.7811f)
                                    lineTo(162.302f, 66.4405f)
                                    curveTo(163.231f, 66.2317f, 163.753f, 65.2411f, 163.399f, 64.3569f)
                                    curveTo(163.164f, 63.7697f, 162.596f, 63.3846f, 161.963f, 63.3846f)
                                    horizontalLineTo(161.287f)
                                    curveTo(160.353f, 63.3846f, 159.495f, 63.895f, 159.05f, 64.7149f)
                                    lineTo(158.651f, 65.4487f)
                                    curveTo(158.593f, 65.5545f, 158.528f, 65.6559f, 158.456f, 65.7522f)
                                    curveTo(157.4f, 67.16f, 155.254f, 67.0493f, 154.349f, 65.5403f)
                                    lineTo(154.194f, 65.2823f)
                                    curveTo(153.533f, 64.1807f, 152.183f, 63.703f, 150.976f, 64.1435f)
                                    lineTo(147.429f, 65.4387f)
                                    curveTo(147.122f, 65.5507f, 146.833f, 65.7066f, 146.571f, 65.9015f)
                                    lineTo(144.451f, 67.4797f)
                                    curveTo(143.644f, 68.08f, 142.486f, 67.713f, 142.173f, 66.7577f)
                                    curveTo(141.954f, 66.0894f, 142.238f, 65.3593f, 142.851f, 65.015f)
                                    lineTo(143.501f, 64.6499f)
                                    curveTo(144.149f, 64.2863f, 144.55f, 63.6013f, 144.55f, 62.8584f)
                                    curveTo(144.55f, 62.2157f, 144.851f, 61.61f, 145.363f, 61.2216f)
                                    lineTo(148.376f, 58.936f)
                                    curveTo(148.625f, 58.7471f, 148.826f, 58.5023f, 148.962f, 58.2213f)
                                    curveTo(149.353f, 57.4173f, 150.233f, 56.973f, 151.112f, 57.1352f)
                                    lineTo(152.562f, 57.4027f)
                                    curveTo(153.776f, 57.6266f, 154.995f, 57.0377f, 155.575f, 55.9475f)
                                    lineTo(155.871f, 55.3898f)
                                    curveTo(156.106f, 54.9472f, 156.117f, 54.4193f, 155.901f, 53.9673f)
                                    curveTo(155.351f, 52.8198f, 153.739f, 52.7605f, 153.107f, 53.8645f)
                                    lineTo(152.576f, 54.7913f)
                                    curveTo(152.16f, 55.5174f, 151.168f, 55.6498f, 150.576f, 55.058f)
                                    lineTo(150.504f, 54.9863f)
                                    curveTo(150.312f, 54.7941f, 150.051f, 54.6861f, 149.779f, 54.6861f)
                                    curveTo(149.213f, 54.6861f, 148.754f, 54.2271f, 148.754f, 53.6609f)
                                    verticalLineTo(52.091f)
                                    curveTo(148.754f, 51.5474f, 148.925f, 51.0175f, 149.242f, 50.5762f)
                                    lineTo(151.806f, 47.0101f)
                                    curveTo(153.178f, 45.1014f, 155.56f, 44.1993f, 157.852f, 44.7196f)
                                    lineTo(160.237f, 45.2608f)
                                    curveTo(160.641f, 45.3526f, 160.974f, 45.6393f, 161.124f, 46.026f)
                                    lineTo(161.141f, 46.0679f)
                                    curveTo(161.375f, 46.6704f, 161.091f, 47.3504f, 160.497f, 47.607f)
                                    lineTo(160.177f, 47.7456f)
                                    curveTo(159.931f, 47.8518f, 159.772f, 48.0937f, 159.772f, 48.3613f)
                                    curveTo(159.772f, 48.7317f, 160.073f, 49.032f, 160.443f, 49.032f)
                                    horizontalLineTo(161.229f)
                                    curveTo(161.926f, 49.032f, 162.526f, 48.5373f, 162.659f, 47.8524f)
                                    lineTo(162.769f, 47.2819f)
                                    curveTo(162.918f, 46.5127f, 163.472f, 45.8843f, 164.216f, 45.6398f)
                                    lineTo(168.144f, 44.3495f)
                                    curveTo(169.061f, 44.0483f, 169.742f, 43.2721f, 169.921f, 42.3235f)
                                    curveTo(170.124f, 41.242f, 170.976f, 40.3992f, 172.059f, 40.2062f)
                                    lineTo(172.471f, 40.1328f)
                                    curveTo(173.314f, 39.9827f, 174.064f, 39.5066f, 174.558f, 38.8075f)
                                    lineTo(178.515f, 33.2121f)
                                    curveTo(179.4f, 31.9606f, 180.943f, 31.3524f, 182.444f, 31.663f)
                                    lineTo(182.768f, 31.73f)
                                    curveTo(183.662f, 31.9151f, 184.431f, 32.4812f, 184.874f, 33.2801f)
                                    curveTo(185.615f, 34.6181f, 187.214f, 35.2254f, 188.657f, 34.7171f)
                                    lineTo(189.819f, 34.3076f)
                                    curveTo(190.713f, 33.9926f, 191.701f, 34.0987f, 192.508f, 34.5961f)
                                    curveTo(193.505f, 35.2113f, 194.763f, 35.219f, 195.768f, 34.6159f)
                                    lineTo(197.205f, 33.7539f)
                                    curveTo(198.344f, 33.0702f, 199.681f, 32.7918f, 200.999f, 32.964f)
                                    lineTo(205.221f, 33.5158f)
                                    curveTo(206.691f, 33.7078f, 208.185f, 33.4866f, 209.536f, 32.877f)
                                    curveTo(210.779f, 32.3161f, 212.146f, 32.0832f, 213.504f, 32.2006f)
                                    lineTo(218.234f, 32.6094f)
                                    curveTo(218.867f, 32.664f, 219.418f, 33.0613f, 219.67f, 33.6438f)
                                    curveTo(219.897f, 34.1704f, 219.849f, 34.7758f, 219.539f, 35.2591f)
                                    lineTo(219.184f, 35.8141f)
                                    curveTo(218.74f, 36.5081f, 218.605f, 37.3556f, 218.81f, 38.1534f)
                                    lineTo(218.996f, 38.8742f)
                                    curveTo(219.17f, 39.5485f, 219.192f, 40.2533f, 219.058f, 40.9369f)
                                    lineTo(218.69f, 42.8262f)
                                    curveTo(218.564f, 43.4694f, 218.114f, 44.0014f, 217.5f, 44.2315f)
                                    curveTo(216.712f, 44.5272f, 216.215f, 45.3098f, 216.282f, 46.1493f)
                                    lineTo(216.794f, 52.5082f)
                                    curveTo(216.822f, 52.8646f, 216.572f, 53.1832f, 216.219f, 53.2397f)
                                    curveTo(215.884f, 53.2933f, 215.56f, 53.0939f, 215.458f, 52.7707f)
                                    lineTo(214.369f, 49.3459f)
                                    curveTo(213.775f, 47.4779f, 211.844f, 46.3816f, 209.935f, 46.8294f)
                                    curveTo(209.061f, 47.0345f, 208.29f, 47.5461f, 207.761f, 48.2713f)
                                    lineTo(207.332f, 48.8597f)
                                    curveTo(206.236f, 50.3616f, 205.94f, 52.3023f, 206.536f, 54.063f)
                                    lineTo(207.795f, 57.7801f)
                                    curveTo(208.28f, 59.2105f, 207.949f, 60.7913f, 206.932f, 61.9073f)
                                    lineTo(206.201f, 62.7086f)
                                    curveTo(205.812f, 63.1357f, 205.638f, 63.7171f, 205.729f, 64.288f)
                                    lineTo(205.804f, 64.7569f)
                                    curveTo(205.978f, 65.844f, 205.01f, 66.7684f, 203.932f, 66.5438f)
                                    curveTo(202.809f, 66.3098f, 201.821f, 67.3194f, 202.08f, 68.4372f)
                                    lineTo(202.83f, 71.6714f)
                                    curveTo(203.154f, 73.0719f, 202.637f, 74.5335f, 201.503f, 75.4179f)
                                    lineTo(200.164f, 76.4628f)
                                    curveTo(199.407f, 77.0536f, 198.964f, 77.9603f, 198.964f, 78.9207f)
                                    verticalLineTo(80.6397f)
                                    curveTo(198.964f, 81.412f, 198.338f, 82.0381f, 197.566f, 82.0381f)
                                    horizontalLineTo(196.581f)
                                    curveTo(196.172f, 82.0381f, 195.871f, 82.4232f, 195.97f, 82.8206f)
                                    curveTo(196.138f, 83.4897f, 195.263f, 83.9023f, 194.853f, 83.3475f)
                                    lineTo(191.31f, 78.5507f)
                                    curveTo(190.811f, 77.8756f, 189.914f, 77.6315f, 189.142f, 77.9609f)
                                    lineTo(187.961f, 78.4646f)
                                    curveTo(187.233f, 78.7755f, 186.634f, 79.3286f, 186.266f, 80.0303f)
                                    lineTo(184.532f, 83.3419f)
                                    curveTo(184.367f, 83.6564f, 183.931f, 83.6918f, 183.717f, 83.408f)
                                    lineTo(179.81f, 78.2078f)
                                    curveTo(178.571f, 76.559f, 176.802f, 75.3862f, 174.802f, 74.886f)
                                    lineTo(172.578f, 74.1586f)
                                    curveTo(171.76f, 73.8912f, 171.113f, 74.8746f, 171.682f, 75.5196f)
                                    curveTo(171.763f, 75.6116f, 171.864f, 75.6847f, 171.976f, 75.734f)
                                    lineTo(172.049f, 75.7663f)
                                    curveTo(172.859f, 76.1215f, 173.025f, 77.1973f, 172.36f, 77.78f)
                                    lineTo(171.316f, 78.6954f)
                                    curveTo(170.677f, 79.2556f, 169.762f, 79.3734f, 169.002f, 78.9933f)
                                    lineTo(168.102f, 78.5432f)
                                    curveTo(166.625f, 77.8051f, 164.997f, 79.2287f, 165.531f, 80.7904f)
                                    curveTo(165.787f, 81.5367f, 166.488f, 82.0381f, 167.277f, 82.0381f)
                                    horizontalLineTo(167.327f)
                                    curveTo(168.709f, 82.0381f, 169.637f, 83.4573f, 169.081f, 84.723f)
                                    lineTo(166.831f, 89.8536f)
                                    curveTo(166.7f, 90.1518f, 166.596f, 90.4609f, 166.519f, 90.7773f)
                                    lineTo(165.488f, 95.0236f)
                                    curveTo(165.161f, 96.3703f, 164.548f, 97.6309f, 163.691f, 98.7199f)
                                    lineTo(159.584f, 103.939f)
                                    curveTo(158.94f, 104.757f, 157.957f, 105.234f, 156.916f, 105.234f)
                                    curveTo(155.993f, 105.234f, 155.11f, 104.858f, 154.47f, 104.194f)
                                    lineTo(153.561f, 103.249f)
                                    curveTo(152.399f, 102.042f, 151.75f, 100.433f, 151.75f, 98.7578f)
                                    verticalLineTo(93.8295f)
                                    lineTo(151.239f, 89.6737f)
                                    curveTo(151.071f, 88.3049f, 150.4f, 87.0472f, 149.358f, 86.144f)
                                    curveTo(148.523f, 85.4205f, 147.493f, 84.9616f, 146.396f, 84.8253f)
                                    lineTo(145.986f, 84.7744f)
                                    curveTo(142.516f, 84.3432f, 139.911f, 81.3942f, 139.911f, 77.8973f)
                                    close()
                                    moveTo(112.87f, 37.6708f)
                                    lineTo(112.13f, 38.6962f)
                                    curveTo(111.393f, 39.7173f, 109.84f, 39.6092f, 109.251f, 38.4959f)
                                    curveTo(108.829f, 37.6985f, 109.105f, 36.7107f, 109.878f, 36.2462f)
                                    lineTo(110.962f, 35.5948f)
                                    curveTo(111.362f, 35.3542f, 111.855f, 35.323f, 112.282f, 35.511f)
                                    curveTo(113.121f, 35.8797f, 113.406f, 36.9279f, 112.87f, 37.6708f)
                                    close()
                                    moveTo(114.829f, 39.3051f)
                                    lineTo(114.082f, 39.8305f)
                                    curveTo(113.763f, 40.0549f, 113.574f, 40.4206f, 113.574f, 40.8106f)
                                    curveTo(113.574f, 41.2338f, 113.797f, 41.6256f, 114.161f, 41.8415f)
                                    lineTo(116.004f, 42.9343f)
                                    curveTo(117.074f, 43.5688f, 117.73f, 44.7206f, 117.73f, 45.9645f)
                                    verticalLineTo(46.1689f)
                                    curveTo(117.73f, 46.713f, 117.886f, 47.2455f, 118.181f, 47.7027f)
                                    lineTo(118.606f, 48.3603f)
                                    curveTo(119.195f, 49.2742f, 120.403f, 49.5568f, 121.337f, 48.9995f)
                                    curveTo(122.117f, 48.5335f, 122.49f, 47.603f, 122.248f, 46.7268f)
                                    lineTo(121.006f, 42.2458f)
                                    curveTo(120.645f, 40.9449f, 119.715f, 39.8773f, 118.476f, 39.3422f)
                                    lineTo(117.703f, 39.0086f)
                                    curveTo(116.759f, 38.6007f, 115.67f, 38.713f, 114.829f, 39.3051f)
                                    close()
                                    moveTo(131.739f, 28.4058f)
                                    lineTo(124.44f, 32.6869f)
                                    curveTo(123.815f, 33.0531f, 123.432f, 33.7228f, 123.432f, 34.4468f)
                                    curveTo(123.432f, 34.9686f, 123.632f, 35.4706f, 123.991f, 35.8496f)
                                    lineTo(125.265f, 37.1954f)
                                    curveTo(126.806f, 38.8235f, 127.43f, 41.1152f, 126.927f, 43.3f)
                                    lineTo(125.857f, 47.9447f)
                                    curveTo(125.699f, 48.6308f, 125.867f, 49.3514f, 126.311f, 49.8972f)
                                    curveTo(127.1f, 50.8644f, 128.519f, 51.0189f, 129.496f, 50.2438f)
                                    lineTo(134.355f, 46.3916f)
                                    curveTo(136.09f, 45.0162f, 137.225f, 43.0224f, 137.522f, 40.8283f)
                                    lineTo(137.749f, 39.1546f)
                                    curveTo(137.869f, 38.2696f, 138.111f, 37.4055f, 138.468f, 36.5868f)
                                    lineTo(139.375f, 34.5067f)
                                    curveTo(139.726f, 33.7029f, 139.85f, 32.8187f, 139.736f, 31.9491f)
                                    curveTo(139.465f, 29.8865f, 137.903f, 28.2295f, 135.86f, 27.8379f)
                                    lineTo(135.47f, 27.7632f)
                                    curveTo(134.19f, 27.5178f, 132.863f, 27.7462f, 131.739f, 28.4058f)
                                    close()
                                    moveTo(76.8715f, 47.8478f)
                                    curveTo(76.2032f, 44.263f, 76.7932f, 36.8531f, 83.9663f, 33.6934f)
                                    curveTo(84.1152f, 33.6278f, 84.2642f, 33.5586f, 84.4136f, 33.4892f)
                                    lineTo(84.4136f, 33.4892f)
                                    lineTo(84.4136f, 33.4892f)
                                    curveTo(85.042f, 33.1972f, 85.6794f, 32.901f, 86.3618f, 32.8517f)
                                    curveTo(87.7748f, 32.7496f, 89.9739f, 33.5162f, 92.4937f, 36.7186f)
                                    curveTo(92.5845f, 36.8339f, 92.6706f, 36.9455f, 92.7539f, 37.0533f)
                                    lineTo(92.7547f, 37.0544f)
                                    lineTo(92.755f, 37.0547f)
                                    lineTo(92.755f, 37.0548f)
                                    lineTo(92.7554f, 37.0553f)
                                    lineTo(92.7561f, 37.0562f)
                                    lineTo(92.7561f, 37.0562f)
                                    lineTo(92.7561f, 37.0562f)
                                    curveTo(93.3587f, 37.8366f, 93.8119f, 38.4235f, 94.7807f, 38.8604f)
                                    curveTo(96.6228f, 39.691f, 97.854f, 38.0348f, 99.091f, 36.371f)
                                    curveTo(100.324f, 34.7117f, 101.564f, 33.0448f, 103.42f, 33.8286f)
                                    curveTo(103.939f, 34.0478f, 104.58f, 34.483f, 105.366f, 35.191f)
                                    curveTo(106.188f, 35.9325f, 106.781f, 36.897f, 107.199f, 37.9225f)
                                    lineTo(108.085f, 40.0954f)
                                    curveTo(108.412f, 40.8975f, 109.045f, 41.5364f, 109.844f, 41.871f)
                                    curveTo(111.962f, 42.7578f, 112.523f, 45.4976f, 110.925f, 47.1458f)
                                    lineTo(108.905f, 49.23f)
                                    curveTo(107.623f, 50.5518f, 107.683f, 52.6699f, 109.037f, 53.9171f)
                                    lineTo(109.811f, 54.63f)
                                    curveTo(110.968f, 55.6955f, 112.816f, 55.4043f, 113.589f, 54.0347f)
                                    curveTo(114.463f, 52.4864f, 116.646f, 52.3627f, 117.69f, 53.8024f)
                                    lineTo(119.374f, 56.1262f)
                                    curveTo(120.683f, 57.9331f, 120.386f, 60.4427f, 118.69f, 61.893f)
                                    lineTo(108.791f, 70.3572f)
                                    curveTo(108.299f, 70.7778f, 108.016f, 71.3926f, 108.016f, 72.0397f)
                                    curveTo(108.016f, 73.609f, 106.429f, 74.68f, 104.974f, 74.0926f)
                                    lineTo(103.953f, 73.6806f)
                                    curveTo(102.175f, 72.9628f, 100.236f, 74.2715f, 100.236f, 76.1888f)
                                    curveTo(100.236f, 77.1219f, 100.717f, 77.9891f, 101.508f, 78.4832f)
                                    lineTo(106.1f, 81.3499f)
                                    curveTo(107.69f, 82.3422f, 109.624f, 82.618f, 111.428f, 82.1093f)
                                    curveTo(113.226f, 81.6021f, 115.154f, 81.8745f, 116.741f, 82.8598f)
                                    lineTo(125.935f, 88.5673f)
                                    curveTo(128.207f, 89.9778f, 128.902f, 92.9653f, 127.485f, 95.2333f)
                                    lineTo(118.776f, 109.174f)
                                    curveTo(118.306f, 109.927f, 117.942f, 110.74f, 117.694f, 111.592f)
                                    lineTo(117.015f, 113.923f)
                                    curveTo(116.756f, 114.812f, 116.765f, 115.757f, 117.042f, 116.641f)
                                    lineTo(117.859f, 119.256f)
                                    curveTo(117.983f, 119.654f, 117.836f, 120.088f, 117.493f, 120.327f)
                                    curveTo(117.026f, 120.654f, 116.378f, 120.504f, 116.103f, 120.004f)
                                    lineTo(112.926f, 114.224f)
                                    curveTo(112.368f, 113.209f, 112.076f, 112.069f, 112.076f, 110.911f)
                                    verticalLineTo(100.823f)
                                    curveTo(112.076f, 98.7348f, 111.212f, 96.74f, 109.69f, 95.3112f)
                                    lineTo(108.772f, 94.4494f)
                                    curveTo(107.404f, 93.1655f, 106.81f, 91.2577f, 107.209f, 89.4245f)
                                    curveTo(107.692f, 87.2017f, 106.713f, 84.917f, 104.771f, 83.7334f)
                                    lineTo(98.3756f, 79.8368f)
                                    curveTo(97.8826f, 79.5364f, 97.4645f, 79.1275f, 97.1532f, 78.6412f)
                                    lineTo(92.5813f, 71.5001f)
                                    curveTo(92.3004f, 71.0613f, 91.6262f, 71.2018f, 91.5438f, 71.7162f)
                                    curveTo(91.4515f, 72.2936f, 90.6516f, 72.3703f, 90.4512f, 71.821f)
                                    lineTo(88.5762f, 66.681f)
                                    curveTo(88.4582f, 66.3575f, 88.4263f, 66.0089f, 88.4834f, 65.6694f)
                                    lineTo(89.4847f, 59.7227f)
                                    curveTo(89.8142f, 57.7656f, 89.5332f, 55.7545f, 88.6799f, 53.9626f)
                                    lineTo(86.1301f, 48.6081f)
                                    curveTo(85.5365f, 47.3615f, 84.2789f, 46.5674f, 82.8982f, 46.5674f)
                                    horizontalLineTo(82.7782f)
                                    curveTo(82.0954f, 46.5674f, 81.4304f, 46.785f, 80.8795f, 47.1885f)
                                    lineTo(78.9032f, 48.6362f)
                                    curveTo(78.2258f, 49.1325f, 77.2625f, 48.8618f, 76.9427f, 48.0853f)
                                    curveTo(76.9108f, 48.0078f, 76.8868f, 47.9301f, 76.8715f, 47.8478f)
                                    close()
                                    moveTo(200.507f, 86.1733f)
                                    lineTo(200.18f, 86.5592f)
                                    curveTo(199.524f, 87.3311f, 199.584f, 88.4802f, 200.316f, 89.1798f)
                                    lineTo(200.634f, 89.4832f)
                                    curveTo(200.974f, 89.8084f, 201.467f, 89.9188f, 201.913f, 89.7699f)
                                    curveTo(202.432f, 89.597f, 202.782f, 89.1115f, 202.782f, 88.5647f)
                                    verticalLineTo(87.0087f)
                                    curveTo(202.782f, 86.5364f, 202.524f, 86.1018f, 202.109f, 85.8756f)
                                    curveTo(201.572f, 85.5827f, 200.903f, 85.707f, 200.507f, 86.1733f)
                                    close()
                                    moveTo(200.172f, 102.13f)
                                    verticalLineTo(103.217f)
                                    curveTo(200.172f, 105.292f, 201.855f, 106.974f, 203.93f, 106.974f)
                                    curveTo(204.354f, 106.974f, 204.774f, 106.902f, 205.174f, 106.762f)
                                    lineTo(205.783f, 106.549f)
                                    curveTo(206.776f, 106.2f, 207.863f, 106.227f, 208.837f, 106.625f)
                                    curveTo(209.401f, 106.855f, 209.909f, 107.202f, 210.329f, 107.643f)
                                    lineTo(212.057f, 109.457f)
                                    curveTo(212.408f, 109.826f, 212.843f, 110.106f, 213.325f, 110.274f)
                                    curveTo(214.757f, 110.773f, 216.343f, 110.202f, 217.128f, 108.904f)
                                    lineTo(217.798f, 107.794f)
                                    curveTo(218.126f, 107.253f, 218.343f, 106.652f, 218.438f, 106.026f)
                                    lineTo(218.846f, 103.332f)
                                    curveTo(218.958f, 102.592f, 218.821f, 101.835f, 218.455f, 101.181f)
                                    lineTo(215.666f, 96.1921f)
                                    curveTo(215.288f, 95.5146f, 214.283f, 95.6151f, 214.046f, 96.3541f)
                                    curveTo(213.928f, 96.7215f, 213.587f, 96.9707f, 213.201f, 96.9707f)
                                    horizontalLineTo(212.963f)
                                    curveTo(212.474f, 96.9707f, 212.034f, 96.6783f, 211.844f, 96.2284f)
                                    lineTo(211.679f, 95.8366f)
                                    curveTo(211.242f, 94.8006f, 209.991f, 94.3884f, 209.023f, 94.9617f)
                                    lineTo(206.212f, 96.6279f)
                                    curveTo(205.828f, 96.8553f, 205.414f, 97.027f, 204.982f, 97.1379f)
                                    lineTo(203.812f, 97.438f)
                                    curveTo(201.67f, 97.9878f, 200.172f, 99.9185f, 200.172f, 102.13f)
                                    close()
                                    moveTo(193.89f, 87.776f)
                                    lineTo(195.393f, 90.1434f)
                                    curveTo(195.571f, 90.4227f, 195.878f, 90.5918f, 196.209f, 90.5918f)
                                    curveTo(196.743f, 90.5918f, 197.176f, 90.159f, 197.176f, 89.625f)
                                    verticalLineTo(89.5386f)
                                    curveTo(197.176f, 89.283f, 197.083f, 89.0361f, 196.915f, 88.844f)
                                    lineTo(195.15f, 86.832f)
                                    curveTo(194.919f, 86.5685f, 194.542f, 86.4889f, 194.224f, 86.6365f)
                                    curveTo(193.791f, 86.8374f, 193.634f, 87.3733f, 193.89f, 87.776f)
                                    close()
                                    moveTo(166.948f, 98.2083f)
                                    lineTo(168.479f, 95.8589f)
                                    curveTo(168.74f, 95.4592f, 169.293f, 95.3802f, 169.655f, 95.6908f)
                                    curveTo(169.921f, 95.9189f, 170.005f, 96.2951f, 169.861f, 96.6146f)
                                    lineTo(168.761f, 99.0546f)
                                    curveTo(168.656f, 99.2876f, 168.469f, 99.4744f, 168.237f, 99.5803f)
                                    lineTo(168.158f, 99.6162f)
                                    curveTo(167.672f, 99.8374f, 167.099f, 99.6228f, 166.878f, 99.1368f)
                                    curveTo(166.741f, 98.8357f, 166.767f, 98.4854f, 166.948f, 98.2083f)
                                    close()
                                    moveTo(213.575f, 91.7738f)
                                    lineTo(213.771f, 91.9535f)
                                    curveTo(214.069f, 92.2276f, 214.46f, 92.3797f, 214.865f, 92.3797f)
                                    horizontalLineTo(215.794f)
                                    curveTo(216.199f, 92.3797f, 216.6f, 92.4695f, 216.966f, 92.6426f)
                                    lineTo(218.44f, 93.3396f)
                                    curveTo(218.802f, 93.5107f, 219.235f, 93.3948f, 219.462f, 93.0657f)
                                    curveTo(219.723f, 92.6891f, 219.624f, 92.1717f, 219.242f, 91.9185f)
                                    lineTo(215.437f, 89.3945f)
                                    curveTo(215.189f, 89.2298f, 214.898f, 89.1419f, 214.6f, 89.1419f)
                                    curveTo(213.218f, 89.1419f, 212.557f, 90.8396f, 213.575f, 91.7738f)
                                    close()
                                    moveTo(224.72f, 115.599f)
                                    lineTo(222.493f, 117.484f)
                                    curveTo(222.238f, 117.699f, 222.155f, 118.056f, 222.288f, 118.362f)
                                    curveTo(222.437f, 118.705f, 222.814f, 118.887f, 223.175f, 118.791f)
                                    lineTo(223.865f, 118.607f)
                                    curveTo(224.397f, 118.465f, 224.818f, 118.057f, 224.975f, 117.529f)
                                    lineTo(225.416f, 116.054f)
                                    curveTo(225.539f, 115.641f, 225.049f, 115.321f, 224.72f, 115.599f)
                                    close()
                                    moveTo(226.567f, 113.142f)
                                    lineTo(227.416f, 110.35f)
                                    curveTo(227.541f, 109.938f, 228.126f, 109.941f, 228.247f, 110.355f)
                                    lineTo(228.677f, 111.833f)
                                    curveTo(228.831f, 112.362f, 228.7f, 112.933f, 228.329f, 113.341f)
                                    lineTo(227.85f, 113.869f)
                                    curveTo(227.599f, 114.146f, 227.183f, 114.198f, 226.872f, 113.991f)
                                    curveTo(226.594f, 113.806f, 226.47f, 113.461f, 226.567f, 113.142f)
                                    close()
                                }
                            }
                        }
                    }
                }.build()
        }

    @Composable
    fun Uranus(): ImageVector =
        remember {
            ImageVector
                .Builder(
                    name = "Group 314",
                    defaultWidth = 171.dp,
                    defaultHeight = 173.dp,
                    viewportWidth = 171f,
                    viewportHeight = 173f,
                ).apply {
                    group {
                        group {
                            path(
                                fill =
                                    Brush.linearGradient(
                                        start = Offset(107.988f, 81.2018f),
                                        end = Offset(35.7939f, 107.312f),
                                        colorStops =
                                            arrayOf(
                                                0f to Color(0xFFB68AFF),
                                                1f to Color(0xFF3E16B6),
                                            ),
                                    ),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(74.9586f, 60.9015f)
                                horizontalLineTo(74.95859999999999f)
                                arcTo(39.1647f, 39.1647f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.1233f, 100.06620000000001f)
                                verticalLineTo(100.06620000000001f)
                                arcTo(
                                    39.1647f,
                                    39.1647f,
                                    0f,
                                    isMoreThanHalf = false,
                                    isPositiveArc = true,
                                    74.95859999999999f,
                                    139.23090000000002f,
                                )
                                horizontalLineTo(74.9586f)
                                arcTo(39.1647f, 39.1647f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.7939f, 100.06620000000001f)
                                verticalLineTo(100.06620000000001f)
                                arcTo(39.1647f, 39.1647f, 0f, isMoreThanHalf = false, isPositiveArc = true, 74.9586f, 60.9015f)
                                close()
                            }
                            group {
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFF5D2FE4)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.04439f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(0.783083f, 82.0922f)
                                    lineTo(6.56593f, 79.2198f)
                                    curveTo(16.0924f, 74.4879f, 26.2302f, 71.1029f, 36.6886f, 69.1618f)
                                    lineTo(41.3961f, 68.2881f)
                                    curveTo(48.7313f, 66.9267f, 55.8416f, 64.5526f, 62.5231f, 61.2338f)
                                    verticalLineTo(61.2338f)
                                    curveTo(69.2047f, 57.915f, 76.315f, 55.5409f, 83.6502f, 54.1795f)
                                    lineTo(93.0652f, 52.4321f)
                                    curveTo(100.4f, 51.0707f, 107.511f, 48.6966f, 114.192f, 45.3778f)
                                    verticalLineTo(45.3778f)
                                    curveTo(120.874f, 42.059f, 127.984f, 39.6848f, 135.319f, 38.3234f)
                                    lineTo(149.442f, 35.7023f)
                                    curveTo(153.654f, 34.9206f, 157.737f, 33.5573f, 161.573f, 31.6517f)
                                    verticalLineTo(31.6517f)
                                    curveTo(171.1f, 26.9198f, 181.238f, 23.5347f, 191.696f, 21.5937f)
                                    lineTo(196.403f, 20.72f)
                                    curveTo(203.739f, 19.3586f, 210.849f, 16.9845f, 217.531f, 13.6657f)
                                    curveTo(224.212f, 10.3469f, 231.322f, 7.9727f, 238.658f, 6.6114f)
                                    lineTo(248.073f, 4.86396f)
                                    curveTo(255.408f, 3.5026f, 262.518f, 1.1284f, 269.2f, -2.1904f)
                                    curveTo(275.881f, -5.5092f, 282.992f, -7.8833f, 290.327f, -9.2447f)
                                    lineTo(310.798f, -13.0441f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFF120827)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 2.08878f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(2.31506f, 87.0844f)
                                    lineTo(8.09792f, 84.212f)
                                    curveTo(17.6244f, 79.4801f, 27.7622f, 76.0951f, 38.2206f, 74.154f)
                                    lineTo(42.9281f, 73.2803f)
                                    curveTo(50.2632f, 71.919f, 57.3736f, 69.5448f, 64.0551f, 66.226f)
                                    verticalLineTo(66.226f)
                                    curveTo(70.7367f, 62.9072f, 77.847f, 60.5331f, 85.1821f, 59.1717f)
                                    lineTo(94.5972f, 57.4243f)
                                    curveTo(101.932f, 56.0629f, 109.043f, 53.6888f, 115.724f, 50.37f)
                                    verticalLineTo(50.37f)
                                    curveTo(122.406f, 47.0512f, 129.516f, 44.677f, 136.851f, 43.3157f)
                                    lineTo(150.974f, 40.6945f)
                                    curveTo(155.186f, 39.9128f, 159.269f, 38.5496f, 163.105f, 36.6439f)
                                    verticalLineTo(36.6439f)
                                    curveTo(172.632f, 31.912f, 182.77f, 28.527f, 193.228f, 26.5859f)
                                    lineTo(197.935f, 25.7122f)
                                    curveTo(205.271f, 24.3508f, 212.381f, 21.9767f, 219.062f, 18.6579f)
                                    curveTo(225.744f, 15.3391f, 232.854f, 12.965f, 240.19f, 11.6036f)
                                    lineTo(249.605f, 9.85617f)
                                    curveTo(256.94f, 8.4948f, 264.05f, 6.1207f, 270.732f, 2.8018f)
                                    curveTo(277.413f, -0.5169f, 284.524f, -2.8911f, 291.859f, -4.2525f)
                                    lineTo(312.33f, -8.05184f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFFB098E4)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 4.17757f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(11.1239f, 115.789f)
                                    lineTo(16.9068f, 112.917f)
                                    curveTo(26.4332f, 108.185f, 36.5711f, 104.8f, 47.0294f, 102.859f)
                                    lineTo(51.7369f, 101.985f)
                                    curveTo(59.0721f, 100.624f, 66.1824f, 98.2497f, 72.864f, 94.9309f)
                                    verticalLineTo(94.9309f)
                                    curveTo(79.5455f, 91.6121f, 86.6559f, 89.238f, 93.991f, 87.8766f)
                                    lineTo(103.406f, 86.1292f)
                                    curveTo(110.741f, 84.7678f, 117.852f, 82.3937f, 124.533f, 79.0749f)
                                    verticalLineTo(79.0749f)
                                    curveTo(131.215f, 75.7561f, 138.325f, 73.382f, 145.66f, 72.0206f)
                                    lineTo(159.783f, 69.3995f)
                                    curveTo(163.995f, 68.6178f, 168.077f, 67.2545f, 171.914f, 65.3488f)
                                    verticalLineTo(65.3488f)
                                    curveTo(181.441f, 60.6169f, 191.578f, 57.2319f, 202.037f, 55.2908f)
                                    lineTo(206.744f, 54.4171f)
                                    curveTo(214.079f, 53.0558f, 221.19f, 50.6816f, 227.871f, 47.3628f)
                                    curveTo(234.553f, 44.044f, 241.663f, 41.6699f, 248.998f, 40.3085f)
                                    lineTo(258.413f, 38.5611f)
                                    curveTo(265.749f, 37.1997f, 272.859f, 34.8256f, 279.54f, 31.5068f)
                                    curveTo(286.222f, 28.188f, 293.332f, 25.8138f, 300.667f, 24.4525f)
                                    lineTo(321.139f, 20.6531f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFF331E6F)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 5.48306f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(7.94519f, 105.431f)
                                    lineTo(13.728f, 102.558f)
                                    curveTo(23.2545f, 97.8264f, 33.3924f, 94.4414f, 43.8507f, 92.5003f)
                                    lineTo(48.5582f, 91.6266f)
                                    curveTo(55.8934f, 90.2652f, 63.0037f, 87.8911f, 69.6853f, 84.5723f)
                                    verticalLineTo(84.5723f)
                                    curveTo(76.3668f, 81.2535f, 83.4771f, 78.8794f, 90.8123f, 77.518f)
                                    lineTo(100.227f, 75.7706f)
                                    curveTo(107.562f, 74.4092f, 114.673f, 72.0351f, 121.354f, 68.7163f)
                                    verticalLineTo(68.7163f)
                                    curveTo(128.036f, 65.3975f, 135.146f, 63.0233f, 142.481f, 61.6619f)
                                    lineTo(156.604f, 59.0408f)
                                    curveTo(160.816f, 58.2591f, 164.899f, 56.8959f, 168.735f, 54.9902f)
                                    verticalLineTo(54.9902f)
                                    curveTo(178.262f, 50.2583f, 188.4f, 46.8732f, 198.858f, 44.9322f)
                                    lineTo(203.566f, 44.0585f)
                                    curveTo(210.901f, 42.6971f, 218.011f, 40.323f, 224.693f, 37.0042f)
                                    curveTo(231.374f, 33.6854f, 238.485f, 31.3112f, 245.82f, 29.9499f)
                                    lineTo(255.235f, 28.2025f)
                                    curveTo(262.57f, 26.8411f, 269.68f, 24.4669f, 276.362f, 21.1481f)
                                    curveTo(283.043f, 17.8293f, 290.154f, 15.4552f, 297.489f, 14.0938f)
                                    lineTo(317.96f, 10.2944f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFF6C44DD)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.04439f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(17.6349f, 137.006f)
                                    lineTo(23.4177f, 134.134f)
                                    curveTo(32.9442f, 129.402f, 43.082f, 126.017f, 53.5404f, 124.076f)
                                    lineTo(58.2479f, 123.202f)
                                    curveTo(65.5831f, 121.841f, 72.6934f, 119.467f, 79.375f, 116.148f)
                                    verticalLineTo(116.148f)
                                    curveTo(86.0565f, 112.829f, 93.1668f, 110.455f, 100.502f, 109.093f)
                                    lineTo(109.917f, 107.346f)
                                    curveTo(117.252f, 105.985f, 124.363f, 103.61f, 131.044f, 100.292f)
                                    verticalLineTo(100.292f)
                                    curveTo(137.726f, 96.9729f, 144.836f, 94.5988f, 152.171f, 93.2374f)
                                    lineTo(166.294f, 90.6163f)
                                    curveTo(170.506f, 89.8346f, 174.588f, 88.4713f, 178.425f, 86.5656f)
                                    verticalLineTo(86.5656f)
                                    curveTo(187.952f, 81.8337f, 198.089f, 78.4487f, 208.548f, 76.5076f)
                                    lineTo(213.255f, 75.6339f)
                                    curveTo(220.59f, 74.2726f, 227.701f, 71.8984f, 234.382f, 68.5796f)
                                    curveTo(241.064f, 65.2608f, 248.174f, 62.8867f, 255.509f, 61.5253f)
                                    lineTo(264.924f, 59.7779f)
                                    curveTo(272.26f, 58.4165f, 279.37f, 56.0424f, 286.051f, 52.7236f)
                                    curveTo(292.733f, 49.4048f, 299.843f, 47.0306f, 307.178f, 45.6693f)
                                    lineTo(327.65f, 41.8699f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFF180F37)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 2.08878f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(19.5499f, 143.246f)
                                    lineTo(25.3328f, 140.374f)
                                    curveTo(34.8592f, 135.642f, 44.9971f, 132.257f, 55.4554f, 130.316f)
                                    lineTo(60.163f, 129.442f)
                                    curveTo(67.4981f, 128.081f, 74.6084f, 125.707f, 81.29f, 122.388f)
                                    verticalLineTo(122.388f)
                                    curveTo(87.9715f, 119.069f, 95.0819f, 116.695f, 102.417f, 115.334f)
                                    lineTo(111.832f, 113.586f)
                                    curveTo(119.167f, 112.225f, 126.278f, 109.851f, 132.959f, 106.532f)
                                    verticalLineTo(106.532f)
                                    curveTo(139.641f, 103.213f, 146.751f, 100.839f, 154.086f, 99.4776f)
                                    lineTo(168.209f, 96.8565f)
                                    curveTo(172.421f, 96.0748f, 176.504f, 94.7115f, 180.34f, 92.8058f)
                                    verticalLineTo(92.8058f)
                                    curveTo(189.867f, 88.0739f, 200.004f, 84.6889f, 210.463f, 82.7479f)
                                    lineTo(215.17f, 81.8742f)
                                    curveTo(222.505f, 80.5128f, 229.616f, 78.1386f, 236.297f, 74.8199f)
                                    curveTo(242.979f, 71.5011f, 250.089f, 69.1269f, 257.424f, 67.7655f)
                                    lineTo(266.839f, 66.0181f)
                                    curveTo(274.175f, 64.6568f, 281.285f, 62.2826f, 287.966f, 58.9638f)
                                    curveTo(294.648f, 55.645f, 301.758f, 53.2709f, 309.093f, 51.9095f)
                                    lineTo(329.565f, 48.1101f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFF401F9E)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 2.08878f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(16.1029f, 132.014f)
                                    lineTo(21.8858f, 129.142f)
                                    curveTo(31.4122f, 124.41f, 41.5501f, 121.025f, 52.0084f, 119.084f)
                                    lineTo(56.7159f, 118.21f)
                                    curveTo(64.0511f, 116.849f, 71.1614f, 114.475f, 77.843f, 111.156f)
                                    verticalLineTo(111.156f)
                                    curveTo(84.5245f, 107.837f, 91.6349f, 105.463f, 98.97f, 104.101f)
                                    lineTo(108.385f, 102.354f)
                                    curveTo(115.72f, 100.993f, 122.831f, 98.6186f, 129.512f, 95.2998f)
                                    verticalLineTo(95.2998f)
                                    curveTo(136.194f, 91.981f, 143.304f, 89.6068f, 150.639f, 88.2454f)
                                    lineTo(164.762f, 85.6243f)
                                    curveTo(168.974f, 84.8426f, 173.057f, 83.4793f, 176.893f, 81.5737f)
                                    verticalLineTo(81.5737f)
                                    curveTo(186.42f, 76.8418f, 196.557f, 73.4567f, 207.016f, 71.5157f)
                                    lineTo(211.723f, 70.642f)
                                    curveTo(219.058f, 69.2806f, 226.169f, 66.9065f, 232.85f, 63.5877f)
                                    curveTo(239.532f, 60.2689f, 246.642f, 57.8947f, 253.977f, 56.5334f)
                                    lineTo(263.392f, 54.786f)
                                    curveTo(270.728f, 53.4246f, 277.838f, 51.0504f, 284.519f, 47.7316f)
                                    curveTo(291.201f, 44.4128f, 298.311f, 42.0387f, 305.646f, 40.6773f)
                                    lineTo(326.118f, 36.8779f)
                                }
                            }
                            group {
                                path(
                                    fill =
                                        Brush.linearGradient(
                                            start = Offset(44.4344f, 116.424f),
                                            end = Offset(78.3751f, 97.1854f),
                                            colorStops =
                                                arrayOf(
                                                    0f to Color(0xFF281E3C),
                                                    1f to Color(0xFF6B47B4),
                                                ),
                                        ),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(64.5279f, 36.9725f)
                                    curveTo(43.7278f, 79.6338f, 79.439f, 128.088f, 126.346f, 120.849f)
                                    lineTo(141.385f, 118.527f)
                                    lineTo(9.53684f, 143.717f)
                                    lineTo(64.5279f, 36.9725f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFDDCDFF)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(106.327f, 136.023f)
                                    curveTo(129.724f, 94.7285f, 97.0755f, 44.1601f, 49.8112f, 48.4868f)
                                    lineTo(34.6572f, 49.874f)
                                    lineTo(167.81f, 32.8805f)
                                    lineTo(106.327f, 136.023f)
                                    close()
                                }
                            }
                        }
                    }
                    group {
                        path(
                            fill = null,
                            fillAlpha = 0.8f,
                            stroke =
                                Brush.linearGradient(
                                    start = Offset(85.0292f, 82.7637f),
                                    end = Offset(87.6249f, 91.2223f),
                                    colorStops =
                                        arrayOf(
                                            0f to Color(0xFF311D64),
                                            1f to Color(0xFFDCCBFF),
                                        ),
                                ),
                            strokeAlpha = 0.8f,
                            strokeLineWidth = 2.08878f,
                            strokeLineCap = StrokeCap.Butt,
                            strokeLineJoin = StrokeJoin.Miter,
                            strokeLineMiter = 1.0f,
                            pathFillType = PathFillType.NonZero,
                        ) {
                            moveTo(121.518f, 71.5661f)
                            curveTo(144.49f, 65.3676f, 158.147f, 62.6145f, 158.686f, 64.3715f)
                            curveTo(159.468f, 66.9173f, 127.652f, 78.9388f, 87.6249f, 91.2223f)
                            curveTo(47.5976f, 103.506f, 14.5156f, 111.4f, 13.7344f, 108.854f)
                            curveTo(13.1952f, 107.097f, 23.7884f, 102.408f, 46.2834f, 94.6539f)
                        }
                    }
                    group {
                        path(
                            fill = null,
                            fillAlpha = 0.8f,
                            stroke =
                                Brush.linearGradient(
                                    start = Offset(84.6123f, 84.7582f),
                                    end = Offset(86.0738f, 89.5206f),
                                    colorStops =
                                        arrayOf(
                                            0f to Color(0xFF9747FF),
                                            1f to Color(0xFFA77FF2),
                                        ),
                                ),
                            strokeAlpha = 0.8f,
                            strokeLineWidth = 1.56659f,
                            strokeLineCap = StrokeCap.Butt,
                            strokeLineJoin = StrokeJoin.Miter,
                            strokeLineMiter = 1.0f,
                            pathFillType = PathFillType.NonZero,
                        ) {
                            moveTo(121.853f, 73.3298f)
                            curveTo(142.627f, 67.4698f, 150.659f, 65.4861f, 150.985f, 66.5491f)
                            curveTo(151.458f, 68.0894f, 122.396f, 78.3741f, 86.0738f, 89.5206f)
                            curveTo(49.7513f, 100.667f, 19.923f, 108.454f, 19.4503f, 106.914f)
                            curveTo(19.1241f, 105.851f, 26.3219f, 103.161f, 46.8069f, 96.3598f)
                        }
                    }
                }.build()
        }

    @Composable
    fun Neptune(): ImageVector =
        remember {
            ImageVector
                .Builder(
                    name = "Venus3",
                    defaultWidth = 140.dp,
                    defaultHeight = 140.dp,
                    viewportWidth = 140f,
                    viewportHeight = 140f,
                ).apply {
                    group {
                        group {
                            path(
                                fill =
                                    Brush.linearGradient(
                                        start = Offset(118.673f, 55.38f),
                                        end = Offset(18.7976f, 71.785f),
                                        colorStops =
                                            arrayOf(
                                                0f to Color(0xFF00DDFE),
                                                1f to Color(0xFF5F36D7),
                                            ),
                                    ),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(69.7976f, 19f)
                                horizontalLineTo(69.7976f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120.7976f, 70f)
                                verticalLineTo(70f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69.7976f, 121f)
                                horizontalLineTo(69.7976f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.7976f, 70f)
                                verticalLineTo(70f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69.7976f, 19f)
                                close()
                            }
                            group {
                                path(
                                    fill = null,
                                    fillAlpha = 0.8f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 0.8f,
                                    strokeLineWidth = 7.52003f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-40.573f, 108.065f)
                                    lineTo(7.18861f, 92.8167f)
                                    curveTo(21.0335f, 88.3964f, 35.9152f, 88.4237f, 49.7438f, 92.8946f)
                                    lineTo(75.5329f, 101.232f)
                                    curveTo(89.2806f, 105.677f, 104.071f, 105.731f, 117.851f, 101.386f)
                                    lineTo(145.533f, 92.6569f)
                                    curveTo(159.229f, 88.338f, 173.927f, 88.3643f, 187.608f, 92.7322f)
                                    lineTo(214.344f, 101.268f)
                                    curveTo(228.189f, 105.688f, 243.07f, 105.661f, 256.899f, 101.19f)
                                    lineTo(283.287f, 92.6588f)
                                    curveTo(297.198f, 88.1611f, 312.173f, 88.1611f, 326.084f, 92.6588f)
                                    lineTo(352.338f, 101.147f)
                                    curveTo(366.25f, 105.645f, 381.225f, 105.645f, 395.136f, 101.147f)
                                    lineTo(421.39f, 92.6588f)
                                    curveTo(435.302f, 88.1611f, 450.276f, 88.1611f, 464.188f, 92.6588f)
                                    lineTo(511.841f, 108.065f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.5f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 5.64002f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-67.6548f, 131.044f)
                                    lineTo(-19.8932f, 115.795f)
                                    curveTo(-6.0483f, 111.375f, 8.8334f, 111.402f, 22.662f, 115.873f)
                                    lineTo(48.4511f, 124.211f)
                                    curveTo(62.1988f, 128.656f, 76.9893f, 128.709f, 90.7688f, 124.364f)
                                    lineTo(118.451f, 115.635f)
                                    curveTo(132.147f, 111.316f, 146.845f, 111.343f, 160.526f, 115.71f)
                                    lineTo(187.262f, 124.246f)
                                    curveTo(201.107f, 128.667f, 215.989f, 128.639f, 229.817f, 124.169f)
                                    lineTo(256.205f, 115.637f)
                                    curveTo(270.116f, 111.139f, 285.091f, 111.139f, 299.003f, 115.637f)
                                    lineTo(325.257f, 124.125f)
                                    curveTo(339.168f, 128.623f, 354.143f, 128.623f, 368.054f, 124.125f)
                                    lineTo(394.308f, 115.637f)
                                    curveTo(408.22f, 111.139f, 423.195f, 111.139f, 437.106f, 115.637f)
                                    lineTo(484.759f, 131.044f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 3.76001f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-49.8623f, 116.525f)
                                    lineTo(-2.1007f, 101.277f)
                                    curveTo(11.7442f, 96.8564f, 26.6259f, 96.8837f, 40.4545f, 101.355f)
                                    lineTo(66.2436f, 109.692f)
                                    curveTo(79.9913f, 114.137f, 94.7818f, 114.191f, 108.561f, 109.846f)
                                    lineTo(136.243f, 101.117f)
                                    curveTo(149.94f, 96.798f, 164.637f, 96.8243f, 178.318f, 101.192f)
                                    lineTo(205.054f, 109.728f)
                                    curveTo(218.899f, 114.148f, 233.781f, 114.121f, 247.61f, 109.65f)
                                    lineTo(273.997f, 101.119f)
                                    curveTo(287.909f, 96.6211f, 302.884f, 96.6211f, 316.795f, 101.119f)
                                    lineTo(343.049f, 109.607f)
                                    curveTo(356.961f, 114.105f, 371.935f, 114.105f, 385.847f, 109.607f)
                                    lineTo(412.101f, 101.119f)
                                    curveTo(426.012f, 96.6211f, 440.987f, 96.6211f, 454.899f, 101.119f)
                                    lineTo(502.551f, 116.525f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.88001f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-58.5327f, 121.225f)
                                    lineTo(-10.7711f, 105.977f)
                                    curveTo(3.0738f, 101.556f, 17.9555f, 101.584f, 31.7841f, 106.055f)
                                    lineTo(57.5732f, 114.392f)
                                    curveTo(71.3208f, 118.837f, 86.1114f, 118.891f, 99.8909f, 114.546f)
                                    lineTo(127.573f, 105.817f)
                                    curveTo(141.269f, 101.498f, 155.967f, 101.524f, 169.648f, 105.892f)
                                    lineTo(196.384f, 114.428f)
                                    curveTo(210.229f, 118.848f, 225.111f, 118.821f, 238.939f, 114.35f)
                                    lineTo(265.327f, 105.819f)
                                    curveTo(279.238f, 101.321f, 294.213f, 101.321f, 308.125f, 105.819f)
                                    lineTo(334.379f, 114.307f)
                                    curveTo(348.29f, 118.805f, 363.265f, 118.805f, 377.176f, 114.307f)
                                    lineTo(403.43f, 105.819f)
                                    curveTo(417.342f, 101.321f, 432.317f, 101.321f, 446.228f, 105.819f)
                                    lineTo(493.881f, 121.225f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.940003f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-55.8955f, 123.448f)
                                    lineTo(-8.1339f, 108.199f)
                                    curveTo(5.711f, 103.779f, 20.5927f, 103.807f, 34.4213f, 108.277f)
                                    lineTo(60.2104f, 116.615f)
                                    curveTo(73.958f, 121.06f, 88.7486f, 121.114f, 102.528f, 116.769f)
                                    lineTo(130.21f, 108.04f)
                                    curveTo(143.907f, 103.721f, 158.604f, 103.747f, 172.285f, 108.115f)
                                    lineTo(199.021f, 116.651f)
                                    curveTo(212.866f, 121.071f, 227.748f, 121.044f, 241.576f, 116.573f)
                                    lineTo(267.964f, 108.042f)
                                    curveTo(281.876f, 103.544f, 296.851f, 103.544f, 310.762f, 108.042f)
                                    lineTo(337.016f, 116.53f)
                                    curveTo(350.927f, 121.027f, 365.902f, 121.027f, 379.814f, 116.53f)
                                    lineTo(406.068f, 108.042f)
                                    curveTo(419.979f, 103.544f, 434.954f, 103.544f, 448.865f, 108.042f)
                                    lineTo(496.518f, 123.448f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.940003f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-62.0183f, 126.118f)
                                    lineTo(-14.2567f, 110.869f)
                                    curveTo(-0.4118f, 106.449f, 14.4699f, 106.476f, 28.2985f, 110.947f)
                                    lineTo(54.0876f, 119.285f)
                                    curveTo(67.8352f, 123.729f, 82.6258f, 123.783f, 96.4053f, 119.438f)
                                    lineTo(124.087f, 110.709f)
                                    curveTo(137.784f, 106.39f, 152.481f, 106.417f, 166.162f, 110.784f)
                                    lineTo(192.898f, 119.32f)
                                    curveTo(206.743f, 123.741f, 221.625f, 123.713f, 235.454f, 119.242f)
                                    lineTo(261.841f, 110.711f)
                                    curveTo(275.753f, 106.213f, 290.728f, 106.213f, 304.639f, 110.711f)
                                    lineTo(330.893f, 119.199f)
                                    curveTo(344.805f, 123.697f, 359.779f, 123.697f, 373.691f, 119.199f)
                                    lineTo(399.945f, 110.711f)
                                    curveTo(413.856f, 106.213f, 428.831f, 106.213f, 442.743f, 110.711f)
                                    lineTo(490.395f, 126.118f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.88001f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-48.624f, 102.66f)
                                    lineTo(-0.862416f, 87.4116f)
                                    curveTo(12.9825f, 82.9914f, 27.8641f, 83.0187f, 41.6927f, 87.4896f)
                                    lineTo(67.4819f, 95.8275f)
                                    curveTo(81.2295f, 100.272f, 96.0201f, 100.326f, 109.8f, 95.9807f)
                                    lineTo(137.482f, 87.2519f)
                                    curveTo(151.178f, 82.933f, 165.876f, 82.9593f, 179.557f, 87.3272f)
                                    lineTo(206.293f, 95.8632f)
                                    curveTo(220.138f, 100.283f, 235.019f, 100.256f, 248.848f, 95.7852f)
                                    lineTo(275.236f, 87.2538f)
                                    curveTo(289.147f, 82.7561f, 304.122f, 82.7561f, 318.033f, 87.2538f)
                                    lineTo(344.287f, 95.7419f)
                                    curveTo(358.199f, 100.24f, 373.174f, 100.24f, 387.085f, 95.7419f)
                                    lineTo(413.339f, 87.2538f)
                                    curveTo(427.251f, 82.7561f, 442.225f, 82.7561f, 456.137f, 87.2538f)
                                    lineTo(503.79f, 102.66f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.940003f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-54.3257f, 99.6792f)
                                    lineTo(-6.56408f, 84.4304f)
                                    curveTo(7.2808f, 80.0102f, 22.1625f, 80.0375f, 35.9911f, 84.5084f)
                                    lineTo(61.7802f, 92.8463f)
                                    curveTo(75.5279f, 97.291f, 90.3184f, 97.3446f, 104.098f, 92.9995f)
                                    lineTo(131.78f, 84.2707f)
                                    curveTo(145.477f, 79.9518f, 160.174f, 79.9781f, 173.855f, 84.346f)
                                    lineTo(200.591f, 92.8819f)
                                    curveTo(214.436f, 97.3022f, 229.318f, 97.2749f, 243.146f, 92.804f)
                                    lineTo(269.534f, 84.2726f)
                                    curveTo(283.445f, 79.7749f, 298.42f, 79.7749f, 312.332f, 84.2726f)
                                    lineTo(338.586f, 92.7607f)
                                    curveTo(352.497f, 97.2584f, 367.472f, 97.2584f, 381.384f, 92.7607f)
                                    lineTo(407.637f, 84.2726f)
                                    curveTo(421.549f, 79.7749f, 436.524f, 79.7749f, 450.435f, 84.2726f)
                                    lineTo(498.088f, 99.6792f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.5f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.88001f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-74.0151f, 51.9001f)
                                    lineTo(-23.4465f, 36.255f)
                                    curveTo(-9.9726f, 32.0864f, 4.4502f, 32.1122f, 17.9092f, 36.3289f)
                                    lineTo(47.0707f, 45.4651f)
                                    curveTo(60.4507f, 49.6571f, 74.7852f, 49.7077f, 88.1944f, 45.6103f)
                                    lineTo(119.305f, 36.1042f)
                                    curveTo(132.633f, 32.0315f, 146.877f, 32.0564f, 160.191f, 36.1755f)
                                    lineTo(190.327f, 45.4992f)
                                    curveTo(203.801f, 49.6678f, 218.224f, 49.642f, 231.683f, 45.4254f)
                                    lineTo(261.478f, 36.0905f)
                                    curveTo(275.018f, 31.8485f, 289.531f, 31.8485f, 303.071f, 36.0905f)
                                    lineTo(332.736f, 45.3846f)
                                    curveTo(346.276f, 49.6266f, 360.789f, 49.6266f, 374.329f, 45.3846f)
                                    lineTo(403.994f, 36.0905f)
                                    curveTo(417.534f, 31.8485f, 432.047f, 31.8485f, 445.587f, 36.0905f)
                                    lineTo(496.049f, 51.9001f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.940003f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-64.874f, 48.129f)
                                    lineTo(-14.3054f, 32.4839f)
                                    curveTo(-0.8315f, 28.3153f, 13.5913f, 28.341f, 27.0503f, 32.5577f)
                                    lineTo(56.2118f, 41.694f)
                                    curveTo(69.5918f, 45.8859f, 83.9263f, 45.9365f, 97.3355f, 41.8392f)
                                    lineTo(128.446f, 32.333f)
                                    curveTo(141.774f, 28.2604f, 156.018f, 28.2853f, 169.332f, 32.4044f)
                                    lineTo(199.469f, 41.728f)
                                    curveTo(212.942f, 45.8966f, 227.365f, 45.8709f, 240.824f, 41.6542f)
                                    lineTo(270.619f, 32.3194f)
                                    curveTo(284.159f, 28.0774f, 298.672f, 28.0774f, 312.212f, 32.3194f)
                                    lineTo(341.877f, 41.6135f)
                                    curveTo(355.417f, 45.8555f, 369.93f, 45.8555f, 383.47f, 41.6135f)
                                    lineTo(413.135f, 32.3194f)
                                    curveTo(426.675f, 28.0774f, 441.188f, 28.0774f, 454.728f, 32.3194f)
                                    lineTo(505.19f, 48.129f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 0.940003f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-61.8577f, 31.839f)
                                    lineTo(-11.2891f, 16.1939f)
                                    curveTo(2.1849f, 12.0253f, 16.6077f, 12.0511f, 30.0667f, 16.2677f)
                                    lineTo(59.2282f, 25.404f)
                                    curveTo(72.6081f, 29.596f, 86.9426f, 29.6466f, 100.352f, 25.5492f)
                                    lineTo(131.462f, 16.0431f)
                                    curveTo(144.79f, 11.9704f, 159.035f, 11.9953f, 172.349f, 16.1144f)
                                    lineTo(202.485f, 25.4381f)
                                    curveTo(215.959f, 29.6067f, 230.382f, 29.5809f, 243.841f, 25.3642f)
                                    lineTo(273.636f, 16.0294f)
                                    curveTo(287.176f, 11.7874f, 301.689f, 11.7874f, 315.229f, 16.0294f)
                                    lineTo(344.894f, 25.3235f)
                                    curveTo(358.434f, 29.5655f, 372.947f, 29.5655f, 386.487f, 25.3235f)
                                    lineTo(416.152f, 16.0294f)
                                    curveTo(429.692f, 11.7874f, 444.205f, 11.7874f, 457.745f, 16.0294f)
                                    lineTo(508.206f, 31.839f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.8f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 0.8f,
                                    strokeLineWidth = 3.76001f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-75.3079f, 58.8815f)
                                    lineTo(-24.7393f, 43.2365f)
                                    curveTo(-11.2653f, 39.0679f, 3.1575f, 39.0936f, 16.6165f, 43.3103f)
                                    lineTo(45.778f, 52.4466f)
                                    curveTo(59.1579f, 56.6385f, 73.4924f, 56.6891f, 86.9017f, 52.5917f)
                                    lineTo(118.012f, 43.0856f)
                                    curveTo(131.34f, 39.013f, 145.584f, 39.0378f, 158.898f, 43.1569f)
                                    lineTo(189.035f, 52.4806f)
                                    curveTo(202.509f, 56.6492f, 216.931f, 56.6235f, 230.39f, 52.4068f)
                                    lineTo(260.186f, 43.072f)
                                    curveTo(273.725f, 38.83f, 288.239f, 38.83f, 301.778f, 43.072f)
                                    lineTo(331.444f, 52.366f)
                                    curveTo(344.983f, 56.608f, 359.497f, 56.608f, 373.036f, 52.366f)
                                    lineTo(402.702f, 43.072f)
                                    curveTo(416.241f, 38.83f, 430.755f, 38.83f, 444.294f, 43.072f)
                                    lineTo(494.756f, 58.8815f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.88001f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-74.3533f, 70.6117f)
                                    lineTo(-23.7847f, 54.9666f)
                                    curveTo(-10.3107f, 50.798f, 4.1121f, 50.8237f, 17.5711f, 55.0404f)
                                    lineTo(46.7326f, 64.1767f)
                                    curveTo(60.1125f, 68.3686f, 74.447f, 68.4192f, 87.8563f, 64.3219f)
                                    lineTo(118.966f, 54.8157f)
                                    curveTo(132.295f, 50.7431f, 146.539f, 50.7679f, 159.853f, 54.8871f)
                                    lineTo(189.989f, 64.2107f)
                                    curveTo(203.463f, 68.3793f, 217.886f, 68.3536f, 231.345f, 64.1369f)
                                    lineTo(261.14f, 54.8021f)
                                    curveTo(274.68f, 50.5601f, 289.193f, 50.5601f, 302.733f, 54.8021f)
                                    lineTo(332.398f, 64.0962f)
                                    curveTo(345.938f, 68.3382f, 360.451f, 68.3382f, 373.991f, 64.0962f)
                                    lineTo(403.656f, 54.8021f)
                                    curveTo(417.196f, 50.5601f, 431.709f, 50.5601f, 445.249f, 54.8021f)
                                    lineTo(495.711f, 70.6117f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.88001f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-86.7393f, 65.9117f)
                                    lineTo(-36.1707f, 50.2666f)
                                    curveTo(-22.6967f, 46.098f, -8.2739f, 46.1237f, 5.1851f, 50.3404f)
                                    lineTo(34.3466f, 59.4767f)
                                    curveTo(47.7266f, 63.6686f, 62.061f, 63.7192f, 75.4703f, 59.6218f)
                                    lineTo(106.58f, 50.1157f)
                                    curveTo(119.909f, 46.0431f, 134.153f, 46.0679f, 147.467f, 50.1871f)
                                    lineTo(177.603f, 59.5107f)
                                    curveTo(191.077f, 63.6793f, 205.5f, 63.6536f, 218.959f, 59.4369f)
                                    lineTo(248.754f, 50.1021f)
                                    curveTo(262.294f, 45.8601f, 276.807f, 45.8601f, 290.347f, 50.1021f)
                                    lineTo(320.012f, 59.3962f)
                                    curveTo(333.552f, 63.6382f, 348.065f, 63.6382f, 361.605f, 59.3962f)
                                    lineTo(391.27f, 50.1021f)
                                    curveTo(404.81f, 45.8601f, 419.323f, 45.8601f, 432.863f, 50.1021f)
                                    lineTo(483.325f, 65.9117f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFF00D5F5)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.940003f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-83.2583f, 55.533f)
                                    lineTo(-32.6897f, 39.8879f)
                                    curveTo(-19.2158f, 35.7193f, -4.7929f, 35.7451f, 8.666f, 39.9617f)
                                    lineTo(37.8275f, 49.098f)
                                    curveTo(51.2075f, 53.29f, 65.542f, 53.3406f, 78.9512f, 49.2432f)
                                    lineTo(110.061f, 39.7371f)
                                    curveTo(123.39f, 35.6644f, 137.634f, 35.6893f, 150.948f, 39.8084f)
                                    lineTo(181.084f, 49.1321f)
                                    curveTo(194.558f, 53.3007f, 208.981f, 53.2749f, 222.44f, 49.0582f)
                                    lineTo(252.235f, 39.7234f)
                                    curveTo(265.775f, 35.4814f, 280.288f, 35.4814f, 293.828f, 39.7234f)
                                    lineTo(323.493f, 49.0175f)
                                    curveTo(337.033f, 53.2595f, 351.546f, 53.2595f, 365.086f, 49.0175f)
                                    lineTo(394.751f, 39.7234f)
                                    curveTo(408.291f, 35.4814f, 422.804f, 35.4814f, 436.344f, 39.7234f)
                                    lineTo(486.805f, 55.533f)
                                }
                                path(
                                    fill = SolidColor(Color(0xFFB3F0FA)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(99.4068f, 88.1381f)
                                    curveTo(99.1444f, 91.0738f, 88.8395f, 93.6173f, 78.9718f, 93.0238f)
                                    curveTo(69.1042f, 92.4302f, 60.475f, 90.9898f, 60.7374f, 88.0542f)
                                    curveTo(60.9997f, 85.1185f, 70.0543f, 81.7992f, 79.922f, 82.3928f)
                                    curveTo(89.7897f, 82.9863f, 99.6692f, 85.2024f, 99.4068f, 88.1381f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFF00D5F5)),
                                    fillAlpha = 0.6f,
                                    stroke = SolidColor(Color(0xFF0B6573)),
                                    strokeAlpha = 0.6f,
                                    strokeLineWidth = 0.235001f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(95.1693f, 87.732f)
                                    curveTo(95.1471f, 87.9808f, 95.0124f, 88.241f, 94.7608f, 88.5082f)
                                    curveTo(94.5093f, 88.7753f, 94.1477f, 89.0419f, 93.6883f, 89.3015f)
                                    curveTo(92.7696f, 89.8204f, 91.4783f, 90.3004f, 89.9486f, 90.6968f)
                                    curveTo(86.8902f, 91.4893f, 82.9015f, 91.9416f, 79.0889f, 91.7122f)
                                    curveTo(75.265f, 91.4822f, 71.506f, 91.1133f, 68.7303f, 90.5188f)
                                    curveTo(67.3414f, 90.2214f, 66.2072f, 89.8692f, 65.4355f, 89.4543f)
                                    curveTo(64.6561f, 89.0352f, 64.2899f, 88.5773f, 64.3341f, 88.0829f)
                                    curveTo(64.3566f, 87.8308f, 64.4846f, 87.5629f, 64.7206f, 87.2848f)
                                    curveTo(64.9565f, 87.0069f, 65.2952f, 86.7251f, 65.726f, 86.4474f)
                                    curveTo(66.5875f, 85.8921f, 67.8023f, 85.363f, 69.255f, 84.9174f)
                                    curveTo(72.1596f, 84.0262f, 75.994f, 83.4749f, 79.8047f, 83.7041f)
                                    curveTo(83.6265f, 83.934f, 87.5378f, 84.4024f, 90.4657f, 85.0962f)
                                    curveTo(91.9308f, 85.4434f, 93.1421f, 85.8453f, 93.972f, 86.298f)
                                    curveTo(94.3871f, 86.5244f, 94.7003f, 86.7601f, 94.9026f, 87.0025f)
                                    curveTo(95.1037f, 87.2434f, 95.1914f, 87.4856f, 95.1693f, 87.732f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFF0B6573)),
                                    fillAlpha = 0.5f,
                                    stroke = SolidColor(Color(0xFF0B6573)),
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 0.235001f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(87.0098f, 88.0031f)
                                    curveTo(86.9409f, 88.3053f, 86.641f, 88.6351f, 86.1354f, 88.9522f)
                                    curveTo(85.6359f, 89.2655f, 84.9598f, 89.5511f, 84.1849f, 89.774f)
                                    curveTo(82.6344f, 90.2202f, 80.7109f, 90.4092f, 79.0583f, 90.083f)
                                    curveTo(78.9633f, 90.0642f, 78.868f, 90.0455f, 78.7726f, 90.0267f)
                                    curveTo(77.1827f, 89.7134f, 75.5523f, 89.3921f, 74.3301f, 88.9895f)
                                    curveTo(73.6814f, 88.7758f, 73.1591f, 88.5426f, 72.8204f, 88.2826f)
                                    curveTo(72.4826f, 88.0233f, 72.3502f, 87.7572f, 72.4158f, 87.4693f)
                                    curveTo(72.4854f, 87.1639f, 72.7764f, 86.8239f, 73.2624f, 86.4925f)
                                    curveTo(73.7431f, 86.1646f, 74.3939f, 85.8595f, 75.1429f, 85.6169f)
                                    curveTo(76.6417f, 85.1314f, 78.513f, 84.903f, 80.164f, 85.2289f)
                                    curveTo(81.8406f, 85.5599f, 83.6462f, 85.9354f, 84.9921f, 86.4021f)
                                    curveTo(85.6662f, 86.6357f, 86.2148f, 86.889f, 86.5734f, 87.1647f)
                                    curveTo(86.9332f, 87.4412f, 87.0748f, 87.7175f, 87.0098f, 88.0031f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFF0B6573)),
                                    fillAlpha = 0.5f,
                                    stroke = SolidColor(Color(0xFF0B6573)),
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 0.630735f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(88.9792f, 42.6872f)
                                    curveTo(88.9733f, 42.585f, 88.8704f, 42.3958f, 88.4862f, 42.1641f)
                                    curveTo(88.1223f, 41.9446f, 87.5829f, 41.7354f, 86.8972f, 41.562f)
                                    curveTo(85.5295f, 41.216f, 83.6406f, 41.0272f, 81.5637f, 41.1461f)
                                    curveTo(79.4883f, 41.2649f, 77.3925f, 41.7018f, 75.8296f, 42.239f)
                                    curveTo(75.0464f, 42.5082f, 74.4113f, 42.7978f, 73.9824f, 43.0766f)
                                    curveTo(73.7672f, 43.2164f, 73.6172f, 43.345f, 73.5258f, 43.456f)
                                    curveTo(73.4328f, 43.569f, 73.4236f, 43.6345f, 73.425f, 43.659f)
                                    curveTo(73.4261f, 43.679f, 73.4379f, 43.7325f, 73.5353f, 43.8174f)
                                    curveTo(73.6333f, 43.9028f, 73.7916f, 43.9956f, 74.0191f, 44.0881f)
                                    curveTo(74.4726f, 44.2726f, 75.1322f, 44.4292f, 75.9399f, 44.5477f)
                                    curveTo(77.5502f, 44.7838f, 79.6823f, 44.859f, 81.7694f, 44.7395f)
                                    curveTo(83.8547f, 44.6202f, 85.7194f, 44.2961f, 87.0461f, 43.8746f)
                                    curveTo(87.7118f, 43.663f, 88.2246f, 43.4324f, 88.5604f, 43.2021f)
                                    curveTo(88.9146f, 42.9591f, 88.9845f, 42.7798f, 88.9792f, 42.6872f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFF0B6573)),
                                    fillAlpha = 0.4f,
                                    stroke = SolidColor(Color(0xFF0B6573)),
                                    strokeAlpha = 0.4f,
                                    strokeLineWidth = 0.630735f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(106.315f, 37.7087f)
                                    curveTo(106.182f, 37.3182f, 105.778f, 36.9405f, 105.182f, 36.7223f)
                                    curveTo(104.595f, 36.5072f, 103.865f, 36.4659f, 103.156f, 36.706f)
                                    curveTo(102.447f, 36.9458f, 101.805f, 37.4723f, 101.383f, 38.0619f)
                                    curveTo(100.949f, 38.6678f, 100.804f, 39.2526f, 100.928f, 39.6175f)
                                    curveTo(101.043f, 39.9579f, 101.443f, 40.2297f, 102.113f, 40.3361f)
                                    curveTo(102.764f, 40.4395f, 103.571f, 40.3652f, 104.31f, 40.1153f)
                                    curveTo(105.041f, 39.8678f, 105.624f, 39.4539f, 105.979f, 39.0009f)
                                    curveTo(106.337f, 38.5452f, 106.442f, 38.0856f, 106.315f, 37.7087f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFF0B6573)),
                                    fillAlpha = 0.3f,
                                    stroke = SolidColor(Color(0xFF0B6573)),
                                    strokeAlpha = 0.3f,
                                    strokeLineWidth = 0.630735f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(65.0126f, 47.8328f)
                                    curveTo(65.0126f, 47.3601f, 64.8478f, 46.8528f, 64.5826f, 46.4688f)
                                    curveTo(64.3137f, 46.0794f, 63.983f, 45.8705f, 63.6692f, 45.8705f)
                                    curveTo(63.3525f, 45.8705f, 62.9675f, 46.1026f, 62.6419f, 46.5233f)
                                    curveTo(62.3229f, 46.9357f, 62.1183f, 47.4594f, 62.1183f, 47.9142f)
                                    curveTo(62.1183f, 48.8019f, 62.9104f, 49.4698f, 63.6692f, 49.4698f)
                                    curveTo(64.3649f, 49.4698f, 65.0126f, 48.787f, 65.0126f, 47.8328f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFF0B6573)),
                                    fillAlpha = 0.3f,
                                    stroke = SolidColor(Color(0xFF0B6573)),
                                    strokeAlpha = 0.3f,
                                    strokeLineWidth = 0.630735f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(48.3275f, 45.067f)
                                    curveTo(48.3275f, 44.8027f, 48.2361f, 44.516f, 48.0903f, 44.301f)
                                    curveTo(47.9402f, 44.0796f, 47.7754f, 43.9905f, 47.6475f, 43.9905f)
                                    curveTo(47.5166f, 43.9905f, 47.3185f, 44.095f, 47.1327f, 44.3396f)
                                    curveTo(46.9539f, 44.5749f, 46.8432f, 44.87f, 46.8432f, 45.1167f)
                                    curveTo(46.8432f, 45.5905f, 47.2608f, 45.9447f, 47.6475f, 45.9447f)
                                    curveTo(47.9719f, 45.9447f, 48.3275f, 45.6077f, 48.3275f, 45.067f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill =
                                        Brush.linearGradient(
                                            start = Offset(4.34533f, 119.11f),
                                            end = Offset(72.9132f, 103.928f),
                                            colorStops =
                                                arrayOf(
                                                    0f to Color(0xFF0D0525),
                                                    1f to Color(0xFF2384CC),
                                                ),
                                        ),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(80.8822f, -7.0048f)
                                    curveTo(22.5581f, 55.426f, 58.4245f, 157.669f, 142.969f, 169.982f)
                                    lineTo(170.075f, 173.93f)
                                    lineTo(-70.1232f, 147.65f)
                                    lineTo(80.8822f, -7.0048f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFDBF2FF)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(100.505f, 185.524f)
                                    curveTo(162.576f, 126.817f, 133.097f, 22.5531f, 49.4755f, 5.0386f)
                                    lineTo(22.6645f, -0.576996f)
                                    lineTo(260.78f, 40.4971f)
                                    lineTo(100.505f, 185.524f)
                                    close()
                                }
                            }
                        }
                    }
                }.build()
        }

    @Composable
    fun Venus(): ImageVector =
        remember {
            ImageVector
                .Builder(
                    name = "Venus",
                    defaultWidth = 130.dp,
                    defaultHeight = 130.dp,
                    viewportWidth = 130f,
                    viewportHeight = 130f,
                ).apply {
                    group {
                        group {
                            path(
                                fill =
                                    Brush.linearGradient(
                                        start = Offset(40.1695f, 67.0038f),
                                        end = Offset(126.955f, 59.6302f),
                                        colorStops =
                                            arrayOf(
                                                0f to Color(0xFFF5610F),
                                                1f to Color(0xFFFF9104),
                                            ),
                                    ),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(65f, 14f)
                                horizontalLineTo(65f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 65f)
                                verticalLineTo(65f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65f, 116f)
                                horizontalLineTo(65f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 65f)
                                verticalLineTo(65f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 65f, 14f)
                                close()
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(62.0234f, 79.4736f)
                                    curveTo(62.0234f, 78.5623f, 60.7071f, 77.411f, 59.7958f, 77.411f)
                                    curveTo(58.8844f, 77.411f, 57.4031f, 77.4072f, 57.4031f, 78.3185f)
                                    curveTo(57.4031f, 79.2299f, 58.8844f, 80.7112f, 59.7958f, 80.7112f)
                                    curveTo(60.7071f, 80.7112f, 62.0234f, 80.385f, 62.0234f, 79.4736f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(84.5479f, 54.0617f)
                                    curveTo(84.5479f, 53.1503f, 83.2315f, 51.999f, 82.3202f, 51.999f)
                                    curveTo(81.4088f, 51.999f, 79.9275f, 51.9952f, 79.9275f, 52.9066f)
                                    curveTo(79.9275f, 53.8179f, 81.4088f, 55.2993f, 82.3202f, 55.2993f)
                                    curveTo(83.2315f, 55.2993f, 84.5479f, 54.973f, 84.5479f, 54.0617f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(97.5837f, 93.1697f)
                                    curveTo(97.5837f, 92.2584f, 96.2674f, 91.1071f, 95.3561f, 91.1071f)
                                    curveTo(94.4447f, 91.1071f, 92.9634f, 91.1033f, 92.9634f, 92.0146f)
                                    curveTo(92.9634f, 92.926f, 94.4447f, 94.4073f, 95.3561f, 94.4073f)
                                    curveTo(96.2674f, 94.4073f, 97.5837f, 94.0811f, 97.5837f, 93.1697f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(31.5105f, 24.7681f)
                                    curveTo(31.5105f, 25.6795f, 32.8268f, 26.8308f, 33.7382f, 26.8308f)
                                    curveTo(34.6495f, 26.8308f, 36.1309f, 26.8346f, 36.1309f, 25.9232f)
                                    curveTo(36.1309f, 25.0119f, 34.237f, 25.1807f, 33.3256f, 25.1807f)
                                    curveTo(32.4143f, 25.1807f, 31.5105f, 23.8568f, 31.5105f, 24.7681f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(91.8613f, 25.7834f)
                                    curveTo(91.8613f, 24.8721f, 90.545f, 23.7207f, 89.6337f, 23.7207f)
                                    curveTo(88.7223f, 23.7207f, 87.241f, 23.717f, 87.241f, 24.6283f)
                                    curveTo(87.241f, 25.5397f, 89.3824f, 27.2587f, 90.2937f, 27.2587f)
                                    curveTo(91.205f, 27.2587f, 91.8613f, 26.6947f, 91.8613f, 25.7834f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(28.1133f, 48.1212f)
                                    curveTo(28.1133f, 47.2099f, 29.4296f, 46.0585f, 30.341f, 46.0585f)
                                    curveTo(31.2523f, 46.0585f, 32.7336f, 46.0548f, 32.7336f, 46.9661f)
                                    curveTo(32.7336f, 47.8774f, 31.2523f, 49.3588f, 30.341f, 49.3588f)
                                    curveTo(29.4296f, 49.3588f, 28.1133f, 49.0325f, 28.1133f, 48.1212f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFD66C14)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(61.446f, 82.1138f)
                                    curveTo(61.446f, 81.2025f, 60.1297f, 81.3713f, 59.2184f, 81.3713f)
                                    curveTo(58.307f, 81.3713f, 56.8257f, 80.0474f, 56.8257f, 80.9587f)
                                    curveTo(56.8257f, 81.8701f, 58.307f, 83.3514f, 59.2184f, 83.3514f)
                                    curveTo(60.1297f, 83.3514f, 61.446f, 83.0252f, 61.446f, 82.1138f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFD66C14)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(28.9385f, 90.612f)
                                    curveTo(28.9385f, 89.7006f, 29.8498f, 88.6318f, 28.9385f, 88.6318f)
                                    curveTo(28.0271f, 88.6318f, 25.8032f, 88.298f, 25.8032f, 89.2093f)
                                    curveTo(25.8032f, 90.1207f, 27.2846f, 91.602f, 28.1959f, 91.602f)
                                    curveTo(29.1073f, 91.602f, 28.9385f, 91.5233f, 28.9385f, 90.612f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(78.86f, 79.8713f)
                                    curveTo(78.2481f, 79.196f, 78.4506f, 77.4589f, 79.126f, 76.847f)
                                    curveTo(79.8014f, 76.2352f, 80.8966f, 75.2378f, 81.5085f, 75.9132f)
                                    curveTo(82.1204f, 76.5885f, 82.0172f, 78.6809f, 81.3418f, 79.2928f)
                                    curveTo(80.6664f, 79.9047f, 79.4719f, 80.5467f, 78.86f, 79.8713f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(45.1058f, 76.1619f)
                                    curveTo(44.4939f, 75.4865f, 44.6964f, 73.7495f, 45.3718f, 73.1376f)
                                    curveTo(46.0472f, 72.5257f, 47.1425f, 71.5283f, 47.7544f, 72.2037f)
                                    curveTo(48.3662f, 72.8791f, 48.263f, 74.9715f, 47.5877f, 75.5834f)
                                    curveTo(46.9123f, 76.1953f, 45.7177f, 76.8373f, 45.1058f, 76.1619f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(61.7025f, 113.897f)
                                    curveTo(61.0906f, 113.221f, 61.2931f, 111.484f, 61.9685f, 110.873f)
                                    curveTo(62.6439f, 110.261f, 63.7392f, 109.263f, 64.351f, 109.939f)
                                    curveTo(64.9629f, 110.614f, 64.8597f, 112.706f, 64.1843f, 113.318f)
                                    curveTo(63.509f, 113.93f, 62.3144f, 114.572f, 61.7025f, 113.897f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(64.743f, 18.8431f)
                                    curveTo(65.3549f, 19.5185f, 65.1524f, 21.2555f, 64.477f, 21.8674f)
                                    curveTo(63.8017f, 22.4793f, 62.7064f, 23.4767f, 62.0945f, 22.8013f)
                                    curveTo(61.4826f, 22.1259f, 62.9995f, 20.9795f, 63.6749f, 20.3676f)
                                    curveTo(64.3503f, 19.7557f, 64.1312f, 18.1678f, 64.743f, 18.8431f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(20.6994f, 60.1157f)
                                    curveTo(20.0875f, 59.4404f, 20.29f, 57.7033f, 20.9654f, 57.0914f)
                                    curveTo(21.6408f, 56.4796f, 22.7361f, 55.4822f, 23.348f, 56.1576f)
                                    curveTo(23.9598f, 56.8329f, 23.5271f, 59.5446f, 22.8517f, 60.1565f)
                                    curveTo(22.1763f, 60.7684f, 21.3113f, 60.7911f, 20.6994f, 60.1157f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFFFB802)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(82.9401f, 33.8689f)
                                    curveTo(82.3282f, 33.1935f, 80.5797f, 33.2241f, 79.9043f, 33.8359f)
                                    curveTo(79.2289f, 34.4478f, 78.1286f, 35.4396f, 78.7404f, 36.115f)
                                    curveTo(79.3523f, 36.7904f, 81.4447f, 36.8936f, 82.1201f, 36.2817f)
                                    curveTo(82.7955f, 35.6698f, 83.552f, 34.5442f, 82.9401f, 33.8689f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFD66C14)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(81.0607f, 81.4402f)
                                    curveTo(80.4488f, 80.7648f, 81.5376f, 80.0061f, 82.213f, 79.3942f)
                                    curveTo(82.8884f, 78.7823f, 83.0973f, 76.8067f, 83.7092f, 77.482f)
                                    curveTo(84.3211f, 78.1574f, 84.2179f, 80.2498f, 83.5425f, 80.8617f)
                                    curveTo(82.8671f, 81.4736f, 81.6725f, 82.1156f, 81.0607f, 81.4402f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFD66C14)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(110.857f, 65.9122f)
                                    curveTo(110.245f, 65.2368f, 108.852f, 65.0566f, 109.528f, 64.4447f)
                                    curveTo(110.203f, 63.8328f, 111.627f, 62.0923f, 112.239f, 62.7677f)
                                    curveTo(112.851f, 63.4431f, 112.748f, 65.5355f, 112.072f, 66.1473f)
                                    curveTo(111.397f, 66.7592f, 111.469f, 66.5875f, 110.857f, 65.9122f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = null,
                                    fillAlpha = 0.8f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 0.8f,
                                    strokeLineWidth = 5.28041f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-5.80151f, 68.2894f)
                                    lineTo(12.7365f, 60.4908f)
                                    curveTo(24.4083f, 55.5807f, 37.5718f, 55.6104f, 49.2214f, 60.5732f)
                                    verticalLineTo(60.5732f)
                                    curveTo(60.8049f, 65.5079f, 73.8882f, 65.5663f, 85.5154f, 60.7354f)
                                    lineTo(86.2743f, 60.42f)
                                    curveTo(97.9946f, 55.5504f, 111.246f, 55.6084f, 122.945f, 60.5298f)
                                    verticalLineTo(60.5298f)
                                    curveTo(134.691f, 65.4713f, 148.036f, 65.4581f, 159.76f, 60.4636f)
                                    verticalLineTo(60.4636f)
                                    curveTo(171.515f, 55.456f, 184.832f, 55.4437f, 196.587f, 60.4513f)
                                    verticalLineTo(60.4513f)
                                    curveTo(208.342f, 65.459f, 221.63f, 65.459f, 233.385f, 60.4513f)
                                    verticalLineTo(60.4513f)
                                    curveTo(245.139f, 55.4437f, 258.428f, 55.4437f, 270.182f, 60.4513f)
                                    lineTo(288.581f, 68.2894f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.5f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 3.96031f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-20.2336f, 84.4244f)
                                    lineTo(-1.69566f, 76.6258f)
                                    curveTo(9.9762f, 71.7156f, 23.1397f, 71.7453f, 34.7892f, 76.7081f)
                                    verticalLineTo(76.7081f)
                                    curveTo(46.3727f, 81.6428f, 59.4561f, 81.7013f, 71.0832f, 76.8703f)
                                    lineTo(71.8422f, 76.555f)
                                    curveTo(83.5625f, 71.6853f, 96.8139f, 71.7433f, 108.513f, 76.6648f)
                                    verticalLineTo(76.6648f)
                                    curveTo(120.259f, 81.6062f, 133.604f, 81.593f, 145.328f, 76.5986f)
                                    verticalLineTo(76.5986f)
                                    curveTo(157.083f, 71.5909f, 170.4f, 71.5786f, 182.155f, 76.5863f)
                                    verticalLineTo(76.5863f)
                                    curveTo(193.909f, 81.594f, 207.198f, 81.594f, 218.952f, 76.5863f)
                                    verticalLineTo(76.5863f)
                                    curveTo(230.707f, 71.5786f, 243.996f, 71.5786f, 255.75f, 76.5863f)
                                    lineTo(274.149f, 84.4244f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 2.64021f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-10.752f, 74.2299f)
                                    lineTo(7.78603f, 66.4313f)
                                    curveTo(19.4579f, 61.5211f, 32.6214f, 61.5508f, 44.2709f, 66.5136f)
                                    verticalLineTo(66.5136f)
                                    curveTo(55.8544f, 71.4483f, 68.9378f, 71.5068f, 80.5649f, 66.6758f)
                                    lineTo(81.3239f, 66.3605f)
                                    curveTo(93.0442f, 61.4908f, 106.296f, 61.5488f, 117.994f, 66.4703f)
                                    verticalLineTo(66.4703f)
                                    curveTo(129.74f, 71.4117f, 143.086f, 71.3986f, 154.81f, 66.4041f)
                                    verticalLineTo(66.4041f)
                                    curveTo(166.564f, 61.3964f, 179.881f, 61.3841f, 191.636f, 66.3918f)
                                    verticalLineTo(66.3918f)
                                    curveTo(203.391f, 71.3995f, 216.679f, 71.3995f, 228.434f, 66.3918f)
                                    verticalLineTo(66.3918f)
                                    curveTo(240.189f, 61.3841f, 253.477f, 61.3841f, 265.232f, 66.3918f)
                                    lineTo(283.631f, 74.2299f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.3201f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-15.3723f, 77.5302f)
                                    lineTo(3.16567f, 69.7315f)
                                    curveTo(14.8375f, 64.8214f, 28.001f, 64.8511f, 39.6506f, 69.8139f)
                                    verticalLineTo(69.8139f)
                                    curveTo(51.2341f, 74.7486f, 64.3174f, 74.807f, 75.9446f, 69.9761f)
                                    lineTo(76.7035f, 69.6607f)
                                    curveTo(88.4238f, 64.7911f, 101.675f, 64.8491f, 113.374f, 69.7705f)
                                    verticalLineTo(69.7705f)
                                    curveTo(125.12f, 74.712f, 138.465f, 74.6988f, 150.189f, 69.7044f)
                                    verticalLineTo(69.7044f)
                                    curveTo(161.944f, 64.6967f, 175.261f, 64.6844f, 187.016f, 69.6921f)
                                    verticalLineTo(69.6921f)
                                    curveTo(198.771f, 74.6997f, 212.059f, 74.6997f, 223.814f, 69.6921f)
                                    verticalLineTo(69.6921f)
                                    curveTo(235.569f, 64.6844f, 248.857f, 64.6844f, 260.612f, 69.6921f)
                                    lineTo(279.011f, 77.5302f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.660051f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-13.967f, 79.091f)
                                    lineTo(4.57094f, 71.2924f)
                                    curveTo(16.2428f, 66.3822f, 29.4063f, 66.4119f, 41.0558f, 71.3747f)
                                    verticalLineTo(71.3747f)
                                    curveTo(52.6393f, 76.3094f, 65.7227f, 76.3679f, 77.3498f, 71.5369f)
                                    lineTo(78.1088f, 71.2216f)
                                    curveTo(89.8291f, 66.3519f, 103.08f, 66.4099f, 114.779f, 71.3313f)
                                    verticalLineTo(71.3313f)
                                    curveTo(126.525f, 76.2728f, 139.871f, 76.2596f, 151.594f, 71.2652f)
                                    verticalLineTo(71.2652f)
                                    curveTo(163.349f, 66.2575f, 176.666f, 66.2452f, 188.421f, 71.2529f)
                                    verticalLineTo(71.2529f)
                                    curveTo(200.176f, 76.2605f, 213.464f, 76.2605f, 225.219f, 71.2529f)
                                    verticalLineTo(71.2529f)
                                    curveTo(236.974f, 66.2452f, 250.262f, 66.2452f, 262.017f, 71.2529f)
                                    lineTo(280.416f, 79.091f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.660051f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-17.2297f, 80.9653f)
                                    lineTo(1.30825f, 73.1667f)
                                    curveTo(12.9801f, 68.2565f, 26.1436f, 68.2862f, 37.7931f, 73.249f)
                                    verticalLineTo(73.249f)
                                    curveTo(49.3766f, 78.1837f, 62.46f, 78.2422f, 74.0871f, 73.4112f)
                                    lineTo(74.8461f, 73.0959f)
                                    curveTo(86.5664f, 68.2262f, 99.8178f, 68.2842f, 111.516f, 73.2056f)
                                    verticalLineTo(73.2056f)
                                    curveTo(123.263f, 78.1471f, 136.608f, 78.1339f, 148.332f, 73.1395f)
                                    verticalLineTo(73.1395f)
                                    curveTo(160.087f, 68.1318f, 173.404f, 68.1195f, 185.159f, 73.1272f)
                                    verticalLineTo(73.1272f)
                                    curveTo(196.913f, 78.1348f, 210.202f, 78.1348f, 221.956f, 73.1272f)
                                    verticalLineTo(73.1272f)
                                    curveTo(233.711f, 68.1195f, 246.999f, 68.1195f, 258.754f, 73.1272f)
                                    lineTo(277.153f, 80.9653f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 3.30026f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-6.29663f, 100.797f)
                                    lineTo(13.122f, 92.8808f)
                                    curveTo(25.0112f, 88.0341f, 38.3307f, 88.0635f, 50.1983f, 92.9627f)
                                    lineTo(50.7684f, 93.198f)
                                    curveTo(62.5685f, 98.0693f, 75.8068f, 98.1272f, 87.649f, 93.3592f)
                                    lineTo(89.2675f, 92.7075f)
                                    curveTo(101.041f, 87.9674f, 114.196f, 87.9959f, 125.949f, 92.7868f)
                                    lineTo(127.043f, 93.2329f)
                                    curveTo(138.932f, 98.0796f, 152.251f, 98.0502f, 164.119f, 93.151f)
                                    lineTo(164.933f, 92.8149f)
                                    curveTo(176.87f, 87.8872f, 190.273f, 87.8872f, 202.209f, 92.8149f)
                                    lineTo(202.907f, 93.1029f)
                                    curveTo(214.844f, 98.0306f, 228.246f, 98.0306f, 240.183f, 93.1029f)
                                    lineTo(240.88f, 92.8149f)
                                    curveTo(252.817f, 87.8872f, 266.22f, 87.8872f, 278.156f, 92.8149f)
                                    lineTo(297.492f, 100.797f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.3f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 0.3f,
                                    strokeLineWidth = 1.3201f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-9.95581f, 104.406f)
                                    lineTo(9.4628f, 96.4895f)
                                    curveTo(21.352f, 91.6428f, 34.6715f, 91.6722f, 46.5391f, 96.5714f)
                                    lineTo(47.1092f, 96.8067f)
                                    curveTo(58.9093f, 101.678f, 72.1476f, 101.736f, 83.9899f, 96.9679f)
                                    lineTo(85.6084f, 96.3163f)
                                    curveTo(97.3813f, 91.5761f, 110.537f, 91.6046f, 122.289f, 96.3955f)
                                    lineTo(123.384f, 96.8416f)
                                    curveTo(135.273f, 101.688f, 148.592f, 101.659f, 160.46f, 96.7597f)
                                    lineTo(161.274f, 96.4236f)
                                    curveTo(173.211f, 91.4959f, 186.613f, 91.4959f, 198.55f, 96.4236f)
                                    lineTo(199.248f, 96.7116f)
                                    curveTo(211.184f, 101.639f, 224.587f, 101.639f, 236.524f, 96.7116f)
                                    lineTo(237.221f, 96.4236f)
                                    curveTo(249.158f, 91.4959f, 262.56f, 91.4959f, 274.497f, 96.4236f)
                                    lineTo(293.833f, 104.406f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.330026f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-10.6667f, 105.36f)
                                    lineTo(8.75186f, 97.4437f)
                                    curveTo(20.6411f, 92.597f, 33.9605f, 92.6264f, 45.8282f, 97.5256f)
                                    lineTo(46.3983f, 97.761f)
                                    curveTo(58.1984f, 102.632f, 71.4367f, 102.69f, 83.2789f, 97.9221f)
                                    lineTo(84.8974f, 97.2705f)
                                    curveTo(96.6704f, 92.5304f, 109.826f, 92.5588f, 121.578f, 97.3498f)
                                    lineTo(122.673f, 97.7958f)
                                    curveTo(134.562f, 102.643f, 147.881f, 102.613f, 159.749f, 97.7139f)
                                    lineTo(160.563f, 97.3778f)
                                    curveTo(172.5f, 92.4501f, 185.902f, 92.4501f, 197.839f, 97.3778f)
                                    lineTo(198.537f, 97.6658f)
                                    curveTo(210.474f, 102.594f, 223.876f, 102.594f, 235.813f, 97.6658f)
                                    lineTo(236.51f, 97.3778f)
                                    curveTo(248.447f, 92.4501f, 261.85f, 92.4501f, 273.786f, 97.3778f)
                                    lineTo(293.122f, 105.36f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.330026f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-16.0054f, 107.776f)
                                    lineTo(3.41324f, 99.8595f)
                                    curveTo(15.3024f, 95.0128f, 28.6219f, 95.0422f, 40.4896f, 99.9414f)
                                    lineTo(41.0597f, 100.177f)
                                    curveTo(52.8598f, 105.048f, 66.0981f, 105.106f, 77.9403f, 100.338f)
                                    lineTo(79.5588f, 99.6862f)
                                    curveTo(91.3318f, 94.9461f, 104.487f, 94.9746f, 116.24f, 99.7655f)
                                    lineTo(117.334f, 100.212f)
                                    curveTo(129.223f, 105.058f, 142.543f, 105.029f, 154.41f, 100.13f)
                                    lineTo(155.225f, 99.7936f)
                                    curveTo(167.161f, 94.8659f, 180.564f, 94.8658f, 192.501f, 99.7936f)
                                    lineTo(193.198f, 100.082f)
                                    curveTo(205.135f, 105.009f, 218.537f, 105.009f, 230.474f, 100.082f)
                                    lineTo(231.172f, 99.7936f)
                                    curveTo(243.108f, 94.8659f, 256.511f, 94.8658f, 268.448f, 99.7936f)
                                    lineTo(287.783f, 107.776f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.330026f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-10.3293f, 110.073f)
                                    lineTo(9.08927f, 102.157f)
                                    curveTo(20.9785f, 97.3101f, 34.2979f, 97.3396f, 46.1656f, 102.239f)
                                    lineTo(46.7357f, 102.474f)
                                    curveTo(58.5358f, 107.345f, 71.7741f, 107.403f, 83.6163f, 102.635f)
                                    lineTo(85.2348f, 101.984f)
                                    curveTo(97.0078f, 97.2435f, 110.163f, 97.272f, 121.916f, 102.063f)
                                    lineTo(123.01f, 102.509f)
                                    curveTo(134.899f, 107.356f, 148.219f, 107.326f, 160.086f, 102.427f)
                                    lineTo(160.901f, 102.091f)
                                    curveTo(172.837f, 97.1632f, 186.24f, 97.1632f, 198.177f, 102.091f)
                                    lineTo(198.874f, 102.379f)
                                    curveTo(210.811f, 107.307f, 224.213f, 107.307f, 236.15f, 102.379f)
                                    lineTo(236.848f, 102.091f)
                                    curveTo(248.785f, 97.1632f, 262.187f, 97.1632f, 274.124f, 102.091f)
                                    lineTo(293.459f, 110.073f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.4f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 0.4f,
                                    strokeLineWidth = 1.3201f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-12.3564f, 111.455f)
                                    lineTo(7.06217f, 103.538f)
                                    curveTo(18.9514f, 98.6916f, 32.2708f, 98.721f, 44.1385f, 103.62f)
                                    lineTo(44.7086f, 103.856f)
                                    curveTo(56.5087f, 108.727f, 69.747f, 108.785f, 81.5892f, 104.017f)
                                    lineTo(83.2077f, 103.365f)
                                    curveTo(94.9807f, 98.625f, 108.136f, 98.6534f, 119.889f, 103.444f)
                                    lineTo(120.983f, 103.89f)
                                    curveTo(132.872f, 108.737f, 146.192f, 108.708f, 158.059f, 103.809f)
                                    lineTo(158.873f, 103.472f)
                                    curveTo(170.81f, 98.5447f, 184.213f, 98.5447f, 196.149f, 103.472f)
                                    lineTo(196.847f, 103.76f)
                                    curveTo(208.784f, 108.688f, 222.186f, 108.688f, 234.123f, 103.76f)
                                    lineTo(234.821f, 103.472f)
                                    curveTo(246.757f, 98.5447f, 260.16f, 98.5447f, 272.097f, 103.472f)
                                    lineTo(291.432f, 111.455f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.660051f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-13.0913f, 116.684f)
                                    lineTo(6.3273f, 108.767f)
                                    curveTo(18.2165f, 103.921f, 31.536f, 103.95f, 43.4036f, 108.849f)
                                    lineTo(43.9737f, 109.085f)
                                    curveTo(55.7738f, 113.956f, 69.0121f, 114.014f, 80.8544f, 109.246f)
                                    lineTo(82.4729f, 108.594f)
                                    curveTo(94.2458f, 103.854f, 107.402f, 103.882f, 119.154f, 108.673f)
                                    lineTo(120.248f, 109.119f)
                                    curveTo(132.137f, 113.966f, 145.457f, 113.937f, 157.324f, 109.038f)
                                    lineTo(158.139f, 108.701f)
                                    curveTo(170.075f, 103.774f, 183.478f, 103.774f, 195.415f, 108.701f)
                                    lineTo(196.112f, 108.989f)
                                    curveTo(208.049f, 113.917f, 221.451f, 113.917f, 233.388f, 108.989f)
                                    lineTo(234.086f, 108.701f)
                                    curveTo(246.023f, 103.774f, 259.425f, 103.774f, 271.362f, 108.701f)
                                    lineTo(290.697f, 116.684f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.3201f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-10.092f, 64.4942f)
                                    lineTo(8.44594f, 56.6955f)
                                    curveTo(20.1178f, 51.7854f, 33.2813f, 51.8151f, 44.9308f, 56.7779f)
                                    verticalLineTo(56.7779f)
                                    curveTo(56.5143f, 61.7126f, 69.5977f, 61.771f, 81.2248f, 56.9401f)
                                    lineTo(81.9838f, 56.6247f)
                                    curveTo(93.7041f, 51.7551f, 106.955f, 51.8131f, 118.654f, 56.7345f)
                                    verticalLineTo(56.7345f)
                                    curveTo(130.4f, 61.676f, 143.746f, 61.6628f, 155.469f, 56.6684f)
                                    verticalLineTo(56.6684f)
                                    curveTo(167.224f, 51.6607f, 180.541f, 51.6484f, 192.296f, 56.656f)
                                    verticalLineTo(56.656f)
                                    curveTo(204.051f, 61.6637f, 217.339f, 61.6637f, 229.094f, 56.656f)
                                    verticalLineTo(56.656f)
                                    curveTo(240.849f, 51.6484f, 254.137f, 51.6484f, 265.892f, 56.656f)
                                    lineTo(284.291f, 64.4942f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.660051f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-13.1304f, 62.4007f)
                                    lineTo(5.40761f, 54.6021f)
                                    curveTo(17.0794f, 49.692f, 30.243f, 49.7217f, 41.8925f, 54.6845f)
                                    verticalLineTo(54.6845f)
                                    curveTo(53.476f, 59.6192f, 66.5594f, 59.6776f, 78.1865f, 54.8467f)
                                    lineTo(78.9455f, 54.5313f)
                                    curveTo(90.6658f, 49.6617f, 103.917f, 49.7197f, 115.616f, 54.6411f)
                                    verticalLineTo(54.6411f)
                                    curveTo(127.362f, 59.5826f, 140.707f, 59.5694f, 152.431f, 54.5749f)
                                    verticalLineTo(54.5749f)
                                    curveTo(164.186f, 49.5673f, 177.503f, 49.555f, 189.258f, 54.5626f)
                                    verticalLineTo(54.5626f)
                                    curveTo(201.013f, 59.5703f, 214.301f, 59.5703f, 226.056f, 54.5626f)
                                    verticalLineTo(54.5626f)
                                    curveTo(237.811f, 49.555f, 251.099f, 49.555f, 262.854f, 54.5626f)
                                    lineTo(281.253f, 62.4007f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.5f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.3201f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-23.623f, 37.102f)
                                    lineTo(-4.20443f, 29.1858f)
                                    curveTo(7.6848f, 24.3391f, 21.0042f, 24.3685f, 32.8719f, 29.2677f)
                                    lineTo(33.442f, 29.5031f)
                                    curveTo(45.2421f, 34.3744f, 58.4804f, 34.4322f, 70.3226f, 29.6642f)
                                    lineTo(71.9411f, 29.0126f)
                                    curveTo(83.7141f, 24.2725f, 96.8698f, 24.3009f, 108.622f, 29.0919f)
                                    lineTo(109.716f, 29.5379f)
                                    curveTo(121.606f, 34.3846f, 134.925f, 34.3552f, 146.793f, 29.456f)
                                    lineTo(147.607f, 29.1199f)
                                    curveTo(159.544f, 24.1922f, 172.946f, 24.1922f, 184.883f, 29.1199f)
                                    lineTo(185.58f, 29.4079f)
                                    curveTo(197.517f, 34.3356f, 210.92f, 34.3356f, 222.856f, 29.4079f)
                                    lineTo(223.554f, 29.1199f)
                                    curveTo(235.491f, 24.1922f, 248.893f, 24.1922f, 260.83f, 29.1199f)
                                    lineTo(280.166f, 37.102f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.660051f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-18.7517f, 34.4539f)
                                    lineTo(0.666903f, 26.5377f)
                                    curveTo(12.5561f, 21.691f, 25.8756f, 21.7204f, 37.7432f, 26.6196f)
                                    lineTo(38.3133f, 26.855f)
                                    curveTo(50.1134f, 31.7263f, 63.3517f, 31.7841f, 75.194f, 27.0161f)
                                    lineTo(76.8125f, 26.3645f)
                                    curveTo(88.5854f, 21.6244f, 101.741f, 21.6528f, 113.493f, 26.4438f)
                                    lineTo(114.588f, 26.8898f)
                                    curveTo(126.477f, 31.7365f, 139.796f, 31.7071f, 151.664f, 26.8079f)
                                    lineTo(152.478f, 26.4718f)
                                    curveTo(164.415f, 21.5441f, 177.817f, 21.5441f, 189.754f, 26.4718f)
                                    lineTo(190.452f, 26.7598f)
                                    curveTo(202.389f, 31.6875f, 215.791f, 31.6875f, 227.728f, 26.7598f)
                                    lineTo(228.425f, 26.4718f)
                                    curveTo(240.362f, 21.5441f, 253.765f, 21.5441f, 265.701f, 26.4718f)
                                    lineTo(285.037f, 34.4539f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 0.660051f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-17.1443f, 23.0155f)
                                    lineTo(2.27433f, 15.0993f)
                                    curveTo(14.1635f, 10.2525f, 27.483f, 10.282f, 39.3507f, 15.1812f)
                                    lineTo(39.9208f, 15.4165f)
                                    curveTo(51.7209f, 20.2878f, 64.9592f, 20.3457f, 76.8014f, 15.5777f)
                                    lineTo(78.4199f, 14.926f)
                                    curveTo(90.1928f, 10.1859f, 103.349f, 10.2144f, 115.101f, 15.0053f)
                                    lineTo(116.195f, 15.4514f)
                                    curveTo(128.084f, 20.2981f, 141.404f, 20.2687f, 153.271f, 15.3695f)
                                    lineTo(154.086f, 15.0333f)
                                    curveTo(166.022f, 10.1056f, 179.425f, 10.1056f, 191.362f, 15.0333f)
                                    lineTo(192.059f, 15.3213f)
                                    curveTo(203.996f, 20.2491f, 217.398f, 20.2491f, 229.335f, 15.3213f)
                                    lineTo(230.033f, 15.0333f)
                                    curveTo(241.97f, 10.1056f, 255.372f, 10.1056f, 267.309f, 15.0333f)
                                    lineTo(286.644f, 23.0155f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.8f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 0.8f,
                                    strokeLineWidth = 1.3201f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-24.312f, 42.0042f)
                                    lineTo(-4.8934f, 34.0881f)
                                    curveTo(6.9958f, 29.2413f, 20.3153f, 29.2707f, 32.1829f, 34.1699f)
                                    lineTo(32.753f, 34.4053f)
                                    curveTo(44.5531f, 39.2766f, 57.7914f, 39.3344f, 69.6337f, 34.5664f)
                                    lineTo(71.2522f, 33.9148f)
                                    curveTo(83.0251f, 29.1747f, 96.1808f, 29.2031f, 107.933f, 33.9941f)
                                    lineTo(109.027f, 34.4401f)
                                    curveTo(120.917f, 39.2869f, 134.236f, 39.2574f, 146.104f, 34.3582f)
                                    lineTo(146.918f, 34.0221f)
                                    curveTo(158.855f, 29.0944f, 172.257f, 29.0944f, 184.194f, 34.0221f)
                                    lineTo(184.892f, 34.3101f)
                                    curveTo(196.828f, 39.2378f, 210.231f, 39.2378f, 222.167f, 34.3101f)
                                    lineTo(222.865f, 34.0221f)
                                    curveTo(234.802f, 29.0944f, 248.204f, 29.0944f, 260.141f, 34.0221f)
                                    lineTo(279.477f, 42.0042f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.3201f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-23.8032f, 50.2408f)
                                    lineTo(-4.38461f, 42.3246f)
                                    curveTo(7.5046f, 37.4779f, 20.8241f, 37.5073f, 32.6917f, 42.4065f)
                                    lineTo(33.2618f, 42.6418f)
                                    curveTo(45.0619f, 47.5132f, 58.3002f, 47.571f, 70.1424f, 42.803f)
                                    lineTo(71.7609f, 42.1514f)
                                    curveTo(83.5339f, 37.4113f, 96.6896f, 37.4397f, 108.442f, 42.2307f)
                                    lineTo(109.536f, 42.6767f)
                                    curveTo(121.425f, 47.5234f, 134.745f, 47.494f, 146.612f, 42.5948f)
                                    lineTo(147.427f, 42.2587f)
                                    curveTo(159.363f, 37.331f, 172.766f, 37.331f, 184.703f, 42.2587f)
                                    lineTo(185.4f, 42.5467f)
                                    curveTo(197.337f, 47.4744f, 210.739f, 47.4744f, 222.676f, 42.5467f)
                                    lineTo(223.374f, 42.2587f)
                                    curveTo(235.311f, 37.331f, 248.713f, 37.331f, 260.65f, 42.2587f)
                                    lineTo(279.985f, 50.2408f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFFFB802)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.660051f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-28.5486f, 39.653f)
                                    lineTo(-9.12997f, 31.7368f)
                                    curveTo(2.7592f, 26.8901f, 16.0787f, 26.9195f, 27.9464f, 31.8187f)
                                    lineTo(28.5165f, 32.054f)
                                    curveTo(40.3166f, 36.9253f, 53.5549f, 36.9832f, 65.3971f, 32.2152f)
                                    lineTo(67.0156f, 31.5635f)
                                    curveTo(78.7885f, 26.8234f, 91.9443f, 26.8519f, 103.697f, 31.6428f)
                                    lineTo(104.791f, 32.0889f)
                                    curveTo(116.68f, 36.9356f, 129.999f, 36.9062f, 141.867f, 32.007f)
                                    lineTo(142.681f, 31.6709f)
                                    curveTo(154.618f, 26.7431f, 168.021f, 26.7431f, 179.957f, 31.6709f)
                                    lineTo(180.655f, 31.9589f)
                                    curveTo(192.592f, 36.8866f, 205.994f, 36.8866f, 217.931f, 31.9589f)
                                    lineTo(218.629f, 31.6709f)
                                    curveTo(230.565f, 26.7431f, 243.968f, 26.7431f, 255.904f, 31.6709f)
                                    lineTo(275.24f, 39.653f)
                                }
                            }
                            group {
                                path(
                                    fill =
                                        Brush.linearGradient(
                                            start = Offset(21.0596f, 80.9509f),
                                            end = Offset(51.9987f, 73.6347f),
                                            colorStops =
                                                arrayOf(
                                                    0f to Color(0xFF772B06),
                                                    1f to Color(0xFFFF9A06),
                                                ),
                                        ),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(57.5944f, -4.25981f)
                                    curveTo(16.6404f, 39.5778f, 41.8251f, 111.371f, 101.19f, 120.017f)
                                    lineTo(120.224f, 122.789f)
                                    lineTo(-48.4385f, 104.336f)
                                    lineTo(57.5944f, -4.25981f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFFFEAB3)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(71.3736f, 130.93f)
                                    curveTo(114.958f, 89.7073f, 94.2586f, 16.4951f, 35.5413f, 4.1967f)
                                    lineTo(16.7152f, 0.253554f)
                                    lineTo(183.915f, 29.0949f)
                                    lineTo(71.3736f, 130.93f)
                                    close()
                                }
                            }
                        }
                    }
                }.build()
        }

    @Composable
    fun Jupiter(): ImageVector =
        remember {
            ImageVector
                .Builder(
                    name = "Venus2",
                    defaultWidth = 142.dp,
                    defaultHeight = 142.dp,
                    viewportWidth = 142f,
                    viewportHeight = 142f,
                ).apply {
                    group {
                        group {
                            path(
                                fill =
                                    Brush.linearGradient(
                                        start = Offset(119.875f, 56.38f),
                                        end = Offset(20f, 72.785f),
                                        colorStops =
                                            arrayOf(
                                                0f to Color(0xFFF4E8D5),
                                                1f to Color(0xFFFC7100),
                                            ),
                                    ),
                                fillAlpha = 1.0f,
                                stroke = null,
                                strokeAlpha = 1.0f,
                                strokeLineWidth = 1.0f,
                                strokeLineCap = StrokeCap.Butt,
                                strokeLineJoin = StrokeJoin.Miter,
                                strokeLineMiter = 1.0f,
                                pathFillType = PathFillType.NonZero,
                            ) {
                                moveTo(71f, 20f)
                                horizontalLineTo(71f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 122f, 71f)
                                verticalLineTo(71f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 71f, 122f)
                                horizontalLineTo(71f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 71f)
                                verticalLineTo(71f)
                                arcTo(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 71f, 20f)
                                close()
                            }
                            group {
                                path(
                                    fill = null,
                                    fillAlpha = 0.8f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 0.8f,
                                    strokeLineWidth = 7.73333f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-41.0547f, 111.592f)
                                    lineTo(8.06172f, 95.9103f)
                                    curveTo(22.2993f, 91.3647f, 37.6031f, 91.3928f, 51.8239f, 95.9905f)
                                    lineTo(78.3446f, 104.565f)
                                    curveTo(92.4822f, 109.136f, 107.692f, 109.191f, 121.863f, 104.722f)
                                    lineTo(150.33f, 95.746f)
                                    curveTo(164.415f, 91.3046f, 179.529f, 91.3317f, 193.598f, 95.8235f)
                                    lineTo(221.093f, 104.602f)
                                    curveTo(235.33f, 109.147f, 250.634f, 109.119f, 264.855f, 104.521f)
                                    lineTo(291.991f, 95.748f)
                                    curveTo(306.297f, 91.1227f, 321.697f, 91.1227f, 336.003f, 95.748f)
                                    lineTo(363.002f, 104.477f)
                                    curveTo(377.308f, 109.102f, 392.707f, 109.102f, 407.014f, 104.477f)
                                    lineTo(434.012f, 95.748f)
                                    curveTo(448.318f, 91.1227f, 463.718f, 91.1227f, 478.024f, 95.748f)
                                    lineTo(527.028f, 111.592f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.5f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 5.8f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-68.9048f, 135.222f)
                                    lineTo(-19.7884f, 119.54f)
                                    curveTo(-5.5508f, 114.995f, 9.753f, 115.023f, 23.9738f, 119.621f)
                                    lineTo(50.4945f, 128.195f)
                                    curveTo(64.6321f, 132.766f, 79.8422f, 132.821f, 94.0126f, 128.353f)
                                    lineTo(122.48f, 119.376f)
                                    curveTo(136.565f, 114.935f, 151.679f, 114.962f, 165.748f, 119.454f)
                                    lineTo(193.243f, 128.232f)
                                    curveTo(207.48f, 132.777f, 222.784f, 132.749f, 237.005f, 128.152f)
                                    lineTo(264.141f, 119.378f)
                                    curveTo(278.447f, 114.753f, 293.847f, 114.753f, 308.153f, 119.378f)
                                    lineTo(335.152f, 128.107f)
                                    curveTo(349.458f, 132.732f, 364.857f, 132.732f, 379.163f, 128.107f)
                                    lineTo(406.162f, 119.378f)
                                    curveTo(420.468f, 114.753f, 435.868f, 114.753f, 450.174f, 119.378f)
                                    lineTo(499.178f, 135.222f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 3.86667f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-50.6077f, 120.292f)
                                    lineTo(-1.49126f, 104.61f)
                                    curveTo(12.7463f, 100.065f, 28.0501f, 100.093f, 42.271f, 104.691f)
                                    lineTo(68.7916f, 113.265f)
                                    curveTo(82.9292f, 117.836f, 98.1393f, 117.891f, 112.31f, 113.423f)
                                    lineTo(140.777f, 104.446f)
                                    curveTo(154.862f, 100.005f, 169.976f, 100.032f, 184.046f, 104.524f)
                                    lineTo(211.54f, 113.302f)
                                    curveTo(225.778f, 117.847f, 241.081f, 117.819f, 255.302f, 113.221f)
                                    lineTo(282.438f, 104.448f)
                                    curveTo(296.744f, 99.8228f, 312.144f, 99.8228f, 326.45f, 104.448f)
                                    lineTo(353.449f, 113.177f)
                                    curveTo(367.755f, 117.802f, 383.155f, 117.802f, 397.461f, 113.177f)
                                    lineTo(424.459f, 104.448f)
                                    curveTo(438.765f, 99.8228f, 454.165f, 99.8228f, 468.471f, 104.448f)
                                    lineTo(517.475f, 120.292f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.93333f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-59.5239f, 125.125f)
                                    lineTo(-10.4075f, 109.444f)
                                    curveTo(3.8301f, 104.898f, 19.1339f, 104.926f, 33.3547f, 109.524f)
                                    lineTo(59.8753f, 118.098f)
                                    curveTo(74.013f, 122.669f, 89.2231f, 122.724f, 103.393f, 118.256f)
                                    lineTo(131.861f, 109.279f)
                                    curveTo(145.946f, 104.838f, 161.06f, 104.865f, 175.129f, 109.357f)
                                    lineTo(202.624f, 118.135f)
                                    curveTo(216.861f, 122.681f, 232.165f, 122.653f, 246.386f, 118.055f)
                                    lineTo(273.522f, 109.281f)
                                    curveTo(287.828f, 104.656f, 303.228f, 104.656f, 317.534f, 109.281f)
                                    lineTo(344.533f, 118.01f)
                                    curveTo(358.839f, 122.636f, 374.238f, 122.636f, 388.544f, 118.01f)
                                    lineTo(415.543f, 109.281f)
                                    curveTo(429.849f, 104.656f, 445.249f, 104.656f, 459.555f, 109.281f)
                                    lineTo(508.559f, 125.125f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.966667f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-56.8118f, 127.411f)
                                    lineTo(-7.69536f, 111.73f)
                                    curveTo(6.5422f, 107.184f, 21.846f, 107.212f, 36.0669f, 111.81f)
                                    lineTo(62.5875f, 120.384f)
                                    curveTo(76.7251f, 124.955f, 91.9352f, 125.01f, 106.106f, 120.542f)
                                    lineTo(134.573f, 111.565f)
                                    curveTo(148.658f, 107.124f, 163.772f, 107.151f, 177.841f, 111.643f)
                                    lineTo(205.336f, 120.421f)
                                    curveTo(219.573f, 124.966f, 234.877f, 124.938f, 249.098f, 120.341f)
                                    lineTo(276.234f, 111.567f)
                                    curveTo(290.54f, 106.942f, 305.94f, 106.942f, 320.246f, 111.567f)
                                    lineTo(347.245f, 120.296f)
                                    curveTo(361.551f, 124.921f, 376.95f, 124.921f, 391.256f, 120.296f)
                                    lineTo(418.255f, 111.567f)
                                    curveTo(432.561f, 106.942f, 447.961f, 106.942f, 462.267f, 111.567f)
                                    lineTo(511.271f, 127.411f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.966667f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-63.1084f, 130.156f)
                                    lineTo(-13.992f, 114.475f)
                                    curveTo(0.2456f, 109.929f, 15.5494f, 109.957f, 29.7702f, 114.555f)
                                    lineTo(56.2909f, 123.129f)
                                    curveTo(70.4285f, 127.7f, 85.6386f, 127.755f, 99.809f, 123.287f)
                                    lineTo(128.276f, 114.31f)
                                    curveTo(142.361f, 109.869f, 157.476f, 109.896f, 171.545f, 114.388f)
                                    lineTo(199.039f, 123.166f)
                                    curveTo(213.277f, 127.712f, 228.581f, 127.683f, 242.801f, 123.086f)
                                    lineTo(269.938f, 114.312f)
                                    curveTo(284.244f, 109.687f, 299.643f, 109.687f, 313.949f, 114.312f)
                                    lineTo(340.948f, 123.041f)
                                    curveTo(355.254f, 127.667f, 370.654f, 127.667f, 384.96f, 123.041f)
                                    lineTo(411.958f, 114.312f)
                                    curveTo(426.264f, 109.687f, 441.664f, 109.687f, 455.97f, 114.312f)
                                    lineTo(504.975f, 130.156f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.93333f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-49.334f, 106.033f)
                                    lineTo(-0.217577f, 90.352f)
                                    curveTo(14.02f, 85.8064f, 29.3238f, 85.8344f, 43.5447f, 90.4321f)
                                    lineTo(70.0653f, 99.0065f)
                                    curveTo(84.2029f, 103.577f, 99.413f, 103.632f, 113.583f, 99.1641f)
                                    lineTo(142.051f, 90.1877f)
                                    curveTo(156.136f, 85.7463f, 171.25f, 85.7733f, 185.319f, 90.2651f)
                                    lineTo(212.814f, 99.0432f)
                                    curveTo(227.051f, 103.589f, 242.355f, 103.561f, 256.576f, 98.9631f)
                                    lineTo(283.712f, 90.1897f)
                                    curveTo(298.018f, 85.5644f, 313.418f, 85.5644f, 327.724f, 90.1897f)
                                    lineTo(354.722f, 98.9186f)
                                    curveTo(369.028f, 103.544f, 384.428f, 103.544f, 398.734f, 98.9186f)
                                    lineTo(425.733f, 90.1897f)
                                    curveTo(440.039f, 85.5644f, 455.439f, 85.5644f, 469.745f, 90.1897f)
                                    lineTo(518.749f, 106.033f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.966667f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-55.1975f, 102.968f)
                                    lineTo(-6.0811f, 87.2863f)
                                    curveTo(8.1565f, 82.7407f, 23.4603f, 82.7687f, 37.6811f, 87.3665f)
                                    lineTo(64.2018f, 95.9408f)
                                    curveTo(78.3394f, 100.512f, 93.5495f, 100.567f, 107.72f, 96.0985f)
                                    lineTo(136.187f, 87.122f)
                                    curveTo(150.272f, 82.6806f, 165.387f, 82.7077f, 179.456f, 87.1995f)
                                    lineTo(206.95f, 95.9776f)
                                    curveTo(221.188f, 100.523f, 236.491f, 100.495f, 250.712f, 95.8974f)
                                    lineTo(277.849f, 87.124f)
                                    curveTo(292.155f, 82.4987f, 307.554f, 82.4987f, 321.86f, 87.124f)
                                    lineTo(348.859f, 95.8529f)
                                    curveTo(363.165f, 100.478f, 378.565f, 100.478f, 392.871f, 95.8529f)
                                    lineTo(419.869f, 87.124f)
                                    curveTo(434.175f, 82.4987f, 449.575f, 82.4987f, 463.881f, 87.124f)
                                    lineTo(512.886f, 102.968f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.5f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.93333f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-75.4456f, 53.8335f)
                                    lineTo(-23.4426f, 37.7447f)
                                    curveTo(-9.5864f, 33.4578f, 5.2455f, 33.4843f, 19.0862f, 37.8206f)
                                    lineTo(49.0749f, 47.216f)
                                    curveTo(62.8344f, 51.5269f, 77.5755f, 51.5789f, 91.3651f, 47.3653f)
                                    lineTo(123.358f, 37.5895f)
                                    curveTo(137.064f, 33.4014f, 151.712f, 33.4269f, 165.404f, 37.6629f)
                                    lineTo(196.395f, 47.251f)
                                    curveTo(210.251f, 51.5379f, 225.083f, 51.5114f, 238.924f, 47.1751f)
                                    lineTo(269.564f, 37.5755f)
                                    curveTo(283.488f, 33.2132f, 298.413f, 33.2132f, 312.337f, 37.5755f)
                                    lineTo(342.843f, 47.1332f)
                                    curveTo(356.767f, 51.4956f, 371.692f, 51.4956f, 385.616f, 47.1332f)
                                    lineTo(416.123f, 37.5755f)
                                    curveTo(430.047f, 33.2132f, 444.971f, 33.2132f, 458.895f, 37.5755f)
                                    lineTo(510.788f, 53.8335f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.966667f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-66.0452f, 49.9552f)
                                    lineTo(-14.0422f, 33.8663f)
                                    curveTo(-0.186f, 29.5795f, 14.6459f, 29.606f, 28.4866f, 33.9422f)
                                    lineTo(58.4753f, 43.3377f)
                                    curveTo(72.2348f, 47.6485f, 86.9759f, 47.7006f, 100.765f, 43.487f)
                                    lineTo(132.758f, 33.7112f)
                                    curveTo(146.464f, 29.523f, 161.113f, 29.5486f, 174.804f, 33.7846f)
                                    lineTo(205.795f, 43.3727f)
                                    curveTo(219.652f, 47.6595f, 234.484f, 47.6331f, 248.324f, 43.2968f)
                                    lineTo(278.965f, 33.6972f)
                                    curveTo(292.888f, 29.3348f, 307.813f, 29.3348f, 321.737f, 33.6972f)
                                    lineTo(352.244f, 43.2549f)
                                    curveTo(366.168f, 47.6172f, 381.093f, 47.6172f, 395.016f, 43.2549f)
                                    lineTo(425.523f, 33.6972f)
                                    curveTo(439.447f, 29.3348f, 454.372f, 29.3348f, 468.296f, 33.6972f)
                                    lineTo(520.189f, 49.9552f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 0.966667f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-62.9431f, 33.2031f)
                                    lineTo(-10.9401f, 17.1143f)
                                    curveTo(2.916f, 12.8274f, 17.7479f, 12.8539f, 31.5887f, 17.1902f)
                                    lineTo(61.5773f, 26.5856f)
                                    curveTo(75.3368f, 30.8965f, 90.0779f, 30.9485f, 103.868f, 26.7349f)
                                    lineTo(135.86f, 16.9591f)
                                    curveTo(149.566f, 12.771f, 164.215f, 12.7965f, 177.906f, 17.0325f)
                                    lineTo(208.898f, 26.6206f)
                                    curveTo(222.754f, 30.9075f, 237.586f, 30.881f, 251.426f, 26.5447f)
                                    lineTo(282.067f, 16.9451f)
                                    curveTo(295.991f, 12.5828f, 310.915f, 12.5828f, 324.839f, 16.9451f)
                                    lineTo(355.346f, 26.5028f)
                                    curveTo(369.27f, 30.8651f, 384.195f, 30.8651f, 398.119f, 26.5028f)
                                    lineTo(428.625f, 16.9451f)
                                    curveTo(442.549f, 12.5828f, 457.474f, 12.5828f, 471.398f, 16.9451f)
                                    lineTo(523.291f, 33.2031f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.8f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 0.8f,
                                    strokeLineWidth = 3.86667f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-76.7749f, 61.0127f)
                                    lineTo(-24.7719f, 44.9239f)
                                    curveTo(-10.9158f, 40.637f, 3.9162f, 40.6635f, 17.7569f, 44.9998f)
                                    lineTo(47.7455f, 54.3952f)
                                    curveTo(61.5051f, 58.7061f, 76.2461f, 58.7581f, 90.0357f, 54.5445f)
                                    lineTo(122.028f, 44.7687f)
                                    curveTo(135.735f, 40.5806f, 150.383f, 40.6061f, 164.075f, 44.8421f)
                                    lineTo(195.066f, 54.4302f)
                                    curveTo(208.922f, 58.7171f, 223.754f, 58.6906f, 237.595f, 54.3543f)
                                    lineTo(268.235f, 44.7547f)
                                    curveTo(282.159f, 40.3924f, 297.084f, 40.3924f, 311.008f, 44.7547f)
                                    lineTo(341.514f, 54.3124f)
                                    curveTo(355.438f, 58.6747f, 370.363f, 58.6747f, 384.287f, 54.3124f)
                                    lineTo(414.793f, 44.7547f)
                                    curveTo(428.717f, 40.3924f, 443.642f, 40.3924f, 457.566f, 44.7547f)
                                    lineTo(509.459f, 61.0127f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.93333f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-75.7932f, 73.0755f)
                                    lineTo(-23.7902f, 56.9867f)
                                    curveTo(-9.9341f, 52.6998f, 4.8979f, 52.7263f, 18.7386f, 57.0626f)
                                    lineTo(48.7272f, 66.458f)
                                    curveTo(62.4867f, 70.7689f, 77.2278f, 70.8209f, 91.0174f, 66.6073f)
                                    lineTo(123.01f, 56.8315f)
                                    curveTo(136.716f, 52.6434f, 151.365f, 52.6689f, 165.056f, 56.9049f)
                                    lineTo(196.047f, 66.493f)
                                    curveTo(209.904f, 70.7799f, 224.736f, 70.7534f, 238.576f, 66.4171f)
                                    lineTo(269.217f, 56.8175f)
                                    curveTo(283.14f, 52.4552f, 298.065f, 52.4552f, 311.989f, 56.8175f)
                                    lineTo(342.496f, 66.3752f)
                                    curveTo(356.42f, 70.7376f, 371.345f, 70.7376f, 385.268f, 66.3752f)
                                    lineTo(415.775f, 56.8175f)
                                    curveTo(429.699f, 52.4552f, 444.624f, 52.4552f, 458.548f, 56.8175f)
                                    lineTo(510.441f, 73.0755f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 0.7f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.93333f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-88.5305f, 68.2422f)
                                    lineTo(-36.5275f, 52.1533f)
                                    curveTo(-22.6714f, 47.8665f, -7.8395f, 47.893f, 6.0013f, 52.2293f)
                                    lineTo(35.9899f, 61.6247f)
                                    curveTo(49.7494f, 65.9355f, 64.4905f, 65.9876f, 78.2801f, 61.774f)
                                    lineTo(110.273f, 51.9982f)
                                    curveTo(123.979f, 47.81f, 138.627f, 47.8356f, 152.319f, 52.0716f)
                                    lineTo(183.31f, 61.6597f)
                                    curveTo(197.166f, 65.9465f, 211.998f, 65.9201f, 225.839f, 61.5838f)
                                    lineTo(256.479f, 51.9842f)
                                    curveTo(270.403f, 47.6218f, 285.328f, 47.6218f, 299.252f, 51.9842f)
                                    lineTo(329.758f, 61.5419f)
                                    curveTo(343.682f, 65.9042f, 358.607f, 65.9042f, 372.531f, 61.5419f)
                                    lineTo(403.038f, 51.9842f)
                                    curveTo(416.962f, 47.6218f, 431.886f, 47.6218f, 445.81f, 51.9842f)
                                    lineTo(497.703f, 68.2422f)
                                }
                                path(
                                    fill = null,
                                    fillAlpha = 1.0f,
                                    stroke = SolidColor(Color(0xFFD66C14)),
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 0.966667f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(-84.9507f, 57.5692f)
                                    lineTo(-32.9477f, 41.4804f)
                                    curveTo(-19.0916f, 37.1935f, -4.2596f, 37.22f, 9.5811f, 41.5563f)
                                    lineTo(39.5698f, 50.9517f)
                                    curveTo(53.3293f, 55.2626f, 68.0704f, 55.3146f, 81.86f, 51.101f)
                                    lineTo(113.853f, 41.3252f)
                                    curveTo(127.559f, 37.1371f, 142.207f, 37.1626f, 155.899f, 41.3986f)
                                    lineTo(186.89f, 50.9867f)
                                    curveTo(200.746f, 55.2736f, 215.578f, 55.2471f, 229.419f, 50.9108f)
                                    lineTo(260.059f, 41.3112f)
                                    curveTo(273.983f, 36.9489f, 288.908f, 36.9489f, 302.832f, 41.3112f)
                                    lineTo(333.338f, 50.8689f)
                                    curveTo(347.262f, 55.2312f, 362.187f, 55.2312f, 376.111f, 50.8689f)
                                    lineTo(406.618f, 41.3112f)
                                    curveTo(420.541f, 36.9489f, 435.466f, 36.9489f, 449.39f, 41.3112f)
                                    lineTo(501.283f, 57.5692f)
                                }
                                path(
                                    fill = SolidColor(Color(0xFFD66C14)),
                                    fillAlpha = 0.7f,
                                    stroke = null,
                                    strokeAlpha = 0.7f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(152.554f, 123.191f)
                                    curveTo(152.92f, 126.2f, 143.102f, 130.97f, 133.051f, 132.492f)
                                    curveTo(123f, 134.013f, 114.012f, 134.417f, 113.646f, 131.408f)
                                    curveTo(113.279f, 128.399f, 121.673f, 123.117f, 131.725f, 121.596f)
                                    curveTo(141.776f, 120.075f, 152.188f, 120.183f, 152.554f, 123.191f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFF8B375)),
                                    fillAlpha = 0.6f,
                                    stroke = null,
                                    strokeAlpha = 0.6f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(148.325f, 123.675f)
                                    curveTo(148.609f, 126.007f, 140.695f, 130.088f, 132.902f, 131.268f)
                                    curveTo(125.109f, 132.447f, 117.434f, 133.016f, 117.15f, 130.683f)
                                    curveTo(116.866f, 128.35f, 124.081f, 124f, 131.874f, 122.82f)
                                    curveTo(139.667f, 121.641f, 148.041f, 121.342f, 148.325f, 123.675f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFF91470A)),
                                    fillAlpha = 0.6f,
                                    stroke = null,
                                    strokeAlpha = 0.6f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(88.9578f, 96.8464f)
                                    curveTo(88.7461f, 97.8745f, 83.5764f, 98.3513f, 79.4137f, 97.6193f)
                                    curveTo(75.251f, 96.8873f, 71.5087f, 96.0614f, 71.7205f, 95.0333f)
                                    curveTo(71.9322f, 94.0051f, 76.0178f, 93.164f, 80.1806f, 93.896f)
                                    curveTo(84.3433f, 94.628f, 89.1696f, 95.8182f, 88.9578f, 96.8464f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFD66C14)),
                                    fillAlpha = 0.5f,
                                    stroke = null,
                                    strokeAlpha = 0.5f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(92.4959f, 44.3405f)
                                    curveTo(92.4325f, 43.2335f, 88.8545f, 42.2028f, 84.5278f, 42.4504f)
                                    curveTo(80.2011f, 42.6981f, 75.7896f, 44.2699f, 75.8529f, 45.3769f)
                                    curveTo(75.9163f, 46.4839f, 80.4497f, 47.041f, 84.7764f, 46.7933f)
                                    curveTo(89.1031f, 46.5457f, 92.5593f, 45.4475f, 92.4959f, 44.3405f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFD66C14)),
                                    fillAlpha = 0.4f,
                                    stroke = null,
                                    strokeAlpha = 0.4f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(110.306f, 39.1352f)
                                    curveTo(109.951f, 38.0849f, 108.253f, 37.3572f, 106.647f, 37.9008f)
                                    curveTo(105.041f, 38.4444f, 103.797f, 40.2558f, 104.153f, 41.3061f)
                                    curveTo(104.508f, 42.3564f, 106.435f, 42.5649f, 108.041f, 42.0213f)
                                    curveTo(109.648f, 41.4776f, 110.662f, 40.1855f, 110.306f, 39.1352f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFD66C14)),
                                    fillAlpha = 0.3f,
                                    stroke = null,
                                    strokeAlpha = 0.3f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(67.8499f, 49.6505f)
                                    curveTo(67.8499f, 48.5417f, 67.0861f, 47.3082f, 66.144f, 47.3082f)
                                    curveTo(65.2018f, 47.3082f, 64.2249f, 48.6254f, 64.2249f, 49.7342f)
                                    curveTo(64.2249f, 50.843f, 65.2018f, 51.6582f, 66.144f, 51.6582f)
                                    curveTo(67.0861f, 51.6582f, 67.8499f, 50.7593f, 67.8499f, 49.6505f)
                                    close()
                                }
                                path(
                                    fill = SolidColor(Color(0xFFD66C14)),
                                    fillAlpha = 0.3f,
                                    stroke = null,
                                    strokeAlpha = 0.3f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(50.6916f, 46.8063f)
                                    curveTo(50.6916f, 46.1287f, 50.2334f, 45.3749f, 49.6681f, 45.3749f)
                                    curveTo(49.1028f, 45.3749f, 48.5166f, 46.1798f, 48.5166f, 46.8574f)
                                    curveTo(48.5166f, 47.535f, 49.1028f, 48.0332f, 49.6681f, 48.0332f)
                                    curveTo(50.2334f, 48.0332f, 50.6916f, 47.4839f, 50.6916f, 46.8063f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill =
                                        Brush.linearGradient(
                                            start = Offset(5.13746f, 122.95f),
                                            end = Offset(75.6502f, 107.337f),
                                            colorStops =
                                                arrayOf(
                                                    0f to Color(0xFF511D04),
                                                    1f to Color(0xFFCD7121),
                                                ),
                                        ),
                                    fillAlpha = 1.0f,
                                    stroke = null,
                                    strokeAlpha = 1.0f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(83.8453f, -6.7422f)
                                    curveTo(23.8668f, 57.4594f, 60.7505f, 162.603f, 147.693f, 175.265f)
                                    lineTo(175.568f, 179.325f)
                                    lineTo(-71.4434f, 152.3f)
                                    lineTo(83.8453f, -6.7422f)
                                    close()
                                }
                            }
                            group {
                                path(
                                    fill = SolidColor(Color(0xFFFFEAB3)),
                                    fillAlpha = 0.2f,
                                    stroke = null,
                                    strokeAlpha = 0.2f,
                                    strokeLineWidth = 1.0f,
                                    strokeLineCap = StrokeCap.Butt,
                                    strokeLineJoin = StrokeJoin.Miter,
                                    strokeLineMiter = 1.0f,
                                    pathFillType = PathFillType.NonZero,
                                ) {
                                    moveTo(104.025f, 191.248f)
                                    curveTo(167.857f, 130.876f, 137.541f, 23.654f, 51.5481f, 5.6426f)
                                    lineTo(23.9765f, -0.132251f)
                                    lineTo(268.846f, 42.1069f)
                                    lineTo(104.025f, 191.248f)
                                    close()
                                }
                            }
                        }
                    }
                }.build()
        }
}
