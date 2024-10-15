package br.lpm.main;

import java.util.List;

import java.awt.Color;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.chart.ui.UIUtils;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class BarChart extends ApplicationFrame {

    private String chartTitle;
    private String category;

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new demo instance.
     *
     * @param title  the frame title.
     */
    public BarChart(String title, List<String> names, List<Float> values, String category) {
        super(title);

        this.chartTitle = title;
        this.category = category;

        CategoryDataset dataset = createDataset(names, values);
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart, false);
        chartPanel.setFillZoomRectangle(true);
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);

        this.pack();
        UIUtils.centerFrameOnScreen(this);
        this.setVisible(true);

    }

    /**
     *
     * @return The dataset.
     */
    private CategoryDataset createDataset(List<String> names, List<Float> values) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < names.size(); i++) {
            dataset.addValue( values.get(i), names.get(i), category);
        }

        return dataset;
    }

    /**
     * Creates a sample chart.
     *
     * @param dataset  the dataset.
     *
     * @return The chart.
     */
    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
            chartTitle, category /* x-axis label*/, 
                "#" /* y-axis label */, dataset);
        chart.setBackgroundPaint(Color.WHITE);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        chart.getLegend().setFrame(BlockBorder.NONE);
        return chart;
    }


}
