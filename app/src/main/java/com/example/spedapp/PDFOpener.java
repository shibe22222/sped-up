package com.example.spedapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer=(PDFView) findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("ADHD")){

            myPDFViewer.fromAsset("adhd.pdf").load();
        }

        if (getItem.equals("Autism")){

            myPDFViewer.fromAsset("autism.pdf").load();
        }

        if (getItem.equals("Cerebral Palsy")){

            myPDFViewer.fromAsset("cerebralpalsy.pdf").load();
        }

        if (getItem.equals("Down Syndrome")){

            myPDFViewer.fromAsset("downsyndrome.pdf").load();
        }
        if (getItem.equals("Dyscalculia")){

            myPDFViewer.fromAsset("dyscalculia.pdf").load();
        }
        if (getItem.equals("Dysgraphia")){

            myPDFViewer.fromAsset("dysgraphia.pdf").load();
        }
        if (getItem.equals("Dyslexia")){

            myPDFViewer.fromAsset("dyslexia.pdf").load();
        }
        if (getItem.equals("Intellectual Disability")){

            myPDFViewer.fromAsset("intellectual.pdf").load();
        }
        if (getItem.equals("Speech - Hearing Impairment")){

            myPDFViewer.fromAsset("speechhearing.pdf").load();
        }
        if (getItem.equals("Visual Impairment")){

            myPDFViewer.fromAsset("visual.pdf").load();
        }
        if (getItem.equals("Sources & References")){

            myPDFViewer.fromAsset("sources1.pdf").load();
        }

    }
}
