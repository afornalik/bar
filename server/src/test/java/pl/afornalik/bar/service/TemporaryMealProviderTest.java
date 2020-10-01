package pl.afornalik.bar.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Assert;
import org.junit.Test;
import pl.afornalik.bar.model.Meal;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class TemporaryMealProviderTest {

    public static int INITIAL_NUMBERS_OF_MEALS = 4;

    @Test
    public void shouldReturnListWithFourObjects() {
        //given
        TemporaryMealProvider temporaryMealProvider = new TemporaryMealProvider();
        //when
        List<Meal> results = temporaryMealProvider.provide();
        //then
        Assert.assertEquals(results.size(), INITIAL_NUMBERS_OF_MEALS);
    }

    @Test
    public void should() {

        Stream<String> integerStream = Stream.iterate("dada",text -> text+" dada").limit(10);
        integerStream.forEach(System.out::println);

        Set<Integer> set = Sets.newHashSet(3,2,7,1,5);
        List<Integer> list = Lists.newArrayList(3,2,7,1,5);

        Stream.of(set).peek((x) -> System.out.println("set")).forEach(System.out::println);
        Stream.of(list).peek((x) -> System.out.println("list")).forEachOrdered(System.out::println);

        set.stream().peek((x) -> System.out.print("set ")).flatMap(num -> Stream.of("| "+num+"some text |")).forEach(System.out::println);
        list.stream().peek((x) -> System.out.print("list ")).sorted().forEach(System.out::println);
    }

}