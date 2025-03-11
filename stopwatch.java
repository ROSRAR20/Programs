import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class stopwatch extends Frame implements ActionListener {
    private Label timeLabel;
    private Button startButton, stopButton, resetButton;
    private long startTime;
    private boolean running;
    private Timer timer;
    public  long elapsedTime;

    public stopwatch() {
        // Set up frame
        setTitle("Stopwatch");
        setSize(300, 150);
        setLayout(new FlowLayout());
        
        // Time display label
        timeLabel = new Label("0.0");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timeLabel);

        // Start button
        startButton = new Button("Start");
        startButton.addActionListener(this);
        add(startButton);

        // Stop button
        stopButton = new Button("Stop");
        stopButton.addActionListener(this);
        add(stopButton);

        // Reset button
        resetButton = new Button("Reset");
        resetButton.addActionListener(this);
        add(resetButton);

        // Window closing event
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                dispose();
                System.exit(0);
            }
        });
        
        // Timer for updating time display
        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDisplay();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            start();
        } else if (e.getSource() == stopButton) {
            stop();
        } else if (e.getSource() == resetButton) {
            reset();
        }
    }

    private void start() {
        if (!running) {
            startTime = System.currentTimeMillis();
            running = true;
            timer.start();
        }
    }

    private void stop() {
        if (running) {
            running = false;
            elapsedTime += System.currentTimeMillis() - startTime;
            timer.stop();
        }
    }

    private void reset() {
        running = false;
        timer.stop();
        elapsedTime = 0; 
        timeLabel.setText("0.0");
    }

    private void updateDisplay() {
        if (running) {
            long elapsed = System.currentTimeMillis() - startTime;
            timeLabel.setText(String.format("%.1f", (elapsedTime+elapsed) / 1000.0));
        }
    }

    public static void main(String[] args) {
        stopwatch a = new stopwatch();
        a.setVisible(true);
    }

    // Custom Timer class to use with AWT
    class Timer {
        private int delay;
        private ActionListener listener;
        private java.util.Timer javaTimer;

        public Timer(int delay, ActionListener listener) {
            this.delay = delay;
            this.listener = listener;
        }

        public void start() {
            javaTimer = new java.util.Timer();
            javaTimer.schedule(new java.util.TimerTask() {
                public void run() {
                    listener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
                }
            }, 0, delay);
        }

        public void stop() {
            if (javaTimer != null) {
                javaTimer.cancel();
            }
        }
    }
}
