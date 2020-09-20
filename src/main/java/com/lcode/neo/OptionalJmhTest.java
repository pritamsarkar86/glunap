package com.lcode.neo;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;


@BenchmarkMode(Mode.All)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 2, time = 10, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 2, time = 45, timeUnit = TimeUnit.SECONDS)
@Fork(2)
@State(Scope.Benchmark)
public class OptionalJmhTest {
  private OptionalPerf instance;

  @Setup(Level.Trial)
  public void setUp() {
    instance = new OptionalPerf();
  }

  @Benchmark
  public void withOptional(Blackhole blackhole) {
    blackhole.consume(instance.withOptional(10));
  }

  @Benchmark
  public void withoutOptional(Blackhole blackhole) {
    blackhole.consume(instance.withoutOptional(10));
  }

  /**
   * JMH benchmark entry point.
   *
   * @param args              arguments for the benchmark
   * @throws RunnerException  if any problem happens
   */
  public static void main(String[] args) throws RunnerException {
    Options options = new OptionsBuilder()
        .include(OptionalJmhTest.class.getSimpleName())
        .build();
    new Runner(options).run();
  }

}
