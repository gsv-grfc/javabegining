/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.grfc.edu.vgviewer.figures.support;

import ru.grfc.edu.vgviewer.figures.Figure;

/**
 *
 * @author gsv
 */
interface FigureTextFormatConverter {
    Figure figureFromTextLine(String strLine);
    
    String figureToTextLine(Figure figure) throws Exception;
    
}