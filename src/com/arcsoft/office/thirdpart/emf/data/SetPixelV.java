// Copyright 2002, FreeHEP.

package com.arcsoft.office.thirdpart.emf.data;

import com.arcsoft.office.java.awt.Color;
import android.graphics.Point;
import java.io.IOException;

import com.arcsoft.office.thirdpart.emf.EMFInputStream;
import com.arcsoft.office.thirdpart.emf.EMFTag;

/**
 * SetPixelV TAG.
 * 
 * @author Mark Donszelmann
 * @version $Id: SetPixelV.java 10367 2007-01-22 19:26:48Z duns $
 */
public class SetPixelV extends EMFTag
{

    private Point point;

    private Color color;

    public SetPixelV()
    {
        super(15, 1);
    }

    public SetPixelV(Point point, Color color)
    {
        this();
        this.point = point;
        this.color = color;
    }

    public EMFTag read(int tagID, EMFInputStream emf, int len) throws IOException
    {

        return new SetPixelV(emf.readPOINTL(), emf.readCOLORREF());
    }

    public String toString()
    {
        return super.toString() + "\n  point: " + point + "\n  color: " + color;
    }
}
