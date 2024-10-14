package br.lpm.main;

import java.util.List;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Point;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.chart.ui.HorizontalAlignment;
import org.jfree.chart.ui.RectangleInsets;
import org.jfree.chart.ui.UIUtils;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class PieChart extends ApplicationFrame {

    private String chartTitle;

    private static final long serialVersionUID = 1L;

    static {
        // set a theme using the new shadow generator feature available in
        // 1.0.14 - for backwards compatibility it is not enabled by default
        ChartFactory.setChartTheme(new StandardChartTheme("JFree", false));
    }

    /**
     * Default constructor.
     *
     * @param title the frame title.
     */
    public PieChart(String title, List<String> names, List<Float> values) {
        super(title);

        chartTitle = title;

        PieDataset<String> dataset = createDataset(names, values);
        setContentPane(createPanel(dataset));

        this.pack();
        UIUtils.centerFrameOnScreen(this);
        this.setVisible(true);
    }

    /**
     * Creates a sample dataset.
     *
     * @return A sample dataset.
     */
    private PieDataset<String> createDataset(List<String> names, List<Float> values) {
        DefaultPieDataset<String> dataset = new DefaultPieDataset<String>();
        for (int i = 0; i < names.size(); i++) {
            dataset.setValue(names.get(i), values.get(i));
        }
        return dataset;
    }

    /**
     * Creates a chart.
     *
     * @param dataset the dataset.
     *
     * @return A chart.
     */
    private JFreeChart createChart(PieDataset<String> dataset) {

        JFreeChart chart = ChartFactory.createPieChart(
                chartTitle, // chart title
                dataset, // data
                false, // no legend
                true, // tooltips
                false // no URL generation
        );

        // set a custom background for the chart
        chart.setBackgroundPaint(new GradientPaint(new Point(0, 0),
                new Color(20, 20, 20), new Point(400, 200), Color.DARK_GRAY));

        // customise the title position and font
        TextTitle t = chart.getTitle();
        t.setHorizontalAlignment(HorizontalAlignment.LEFT);
        t.setPaint(new Color(240, 240, 240));
        t.setFont(new Font("Arial", Font.BOLD, 26));

        @SuppressWarnings("unchecked")
        PiePlot<String> plot = (PiePlot<String>) chart.getPlot();
        plot.setBackgroundPaint(null);
        plot.setInteriorGap(0.04);
        plot.setOutlineVisible(false);

        plot.setDefaultSectionOutlinePaint(Color.WHITE);
        plot.setSectionOutlinesVisible(true);
        plot.setDefaultSectionOutlineStroke(new BasicStroke(2.0f));

        // customise the section label appearance
        plot.setLabelFont(new Font("Courier New", Font.BOLD, 20));
        plot.setLabelLinkPaint(Color.WHITE);
        plot.setLabelLinkStroke(new BasicStroke(2.0f));
        plot.setLabelOutlineStroke(null);
        plot.setLabelPaint(Color.WHITE);
        plot.setLabelBackgroundPaint(null);

        return chart;

    }

    /**
     * Creates a panel for the chart.
     *
     * @return A panel.
     */
    public JPanel createPanel(PieDataset<String> dataset) {
        JFreeChart chart = createChart(dataset);
        chart.setPadding(new RectangleInsets(4, 8, 2, 2));
        ChartPanel panel = new ChartPanel(chart, false);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(600, 300));
        return panel;
    }
}
