package com.example.yusaku.firstbaplication;

import android.util.Log;

import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;


/**
 * Created by Yusaku on 2014/11/28.
 */
public class OpenCVUtil {

    public static final Mat binarize(Mat src, double thresholdValue) {
        Mat tmp = new Mat(src.size(), CvType.CV_8UC1);
        Mat bin = new Mat(src.size(), CvType.CV_8UC1);
        Imgproc.cvtColor(src, tmp, Imgproc.COLOR_BGR2GRAY);
        Imgproc.Canny(tmp, tmp, 80, 255);
        Imgproc.HoughLines(tmp, bin, 1, Math.PI/180, 100);



/*        if ( thresholdValue != 0 ) {
            Imgproc.threshold(tmp, bin, thresholdValue, 250, Imgproc.THRESH_BINARY );

        } else {
            Imgproc.threshold(tmp, bin, thresholdValue, 250, Imgproc.THRESH_BINARY | Imgproc.THRESH_OTSU);
        }

        */
        return tmp;
    }
}
