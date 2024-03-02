import reactor.core.publisher.Flux;

public class Publisher {
    Flux<Integer> startFlux() {
        return Flux.range(1, 10);
    }
}
