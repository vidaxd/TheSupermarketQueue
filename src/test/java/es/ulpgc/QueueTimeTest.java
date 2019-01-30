package es.ulpgc;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class QueueTimeTest {

    @Test
    public void given_a_empty_queue_should_be_return_zero() {
        assertThat(QueueTime.solveSuperMarketQueue(new int[]{}, 1)).isEqualTo(0);
    }
}
