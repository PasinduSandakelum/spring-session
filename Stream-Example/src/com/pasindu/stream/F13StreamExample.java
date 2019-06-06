package com.pasindu.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class F13StreamExample {


    public static void main(String[] args) {
//        Map<Integer, BigDecimal> reward = new HashMap<>();
//        reward.put(1, new BigDecimal(1000));
//        reward.put(2, new BigDecimal(2000));
//        reward.put(3, new BigDecimal(3000));
//        reward.put(4, new BigDecimal(4000));

        List<RewardPoint> rewardPoints = new ArrayList<>();
        rewardPoints.add(new RewardPoint(1, new BigDecimal(1000), 1.0));
        rewardPoints.add(new RewardPoint(2, new BigDecimal(2000), 2.0));
        rewardPoints.add(new RewardPoint(3, new BigDecimal(3000), 3.0));
        rewardPoints.add(new RewardPoint(4, new BigDecimal(3500), 3.5));
        rewardPoints.add(new RewardPoint(5, new BigDecimal(4000), 4.0));
        rewardPoints.add(new RewardPoint(5, new BigDecimal(500), 0.5));

        BigDecimal total = new BigDecimal(2500);
        List<RewardPoint> pointsFiltered = new ArrayList<>();
        RewardPoint point = new RewardPoint();

        pointsFiltered = rewardPoints.stream()
                .sorted(Comparator.comparing(RewardPoint::getAmountLimit))
                .filter(p -> total.compareTo(p.getAmountLimit()) >= 0)
                .collect(Collectors.toList());

        point = pointsFiltered.get(pointsFiltered.size() - 1);


//        List<Integer> points = new ArrayList<>();
//        pointList.forEach(System.out::println);

//        reward.entrySet().stream()
//                .filter(p -> p.getValue().intValue() > total.intValue())
//                .peek(v-> points.add(v.getKey()))
//                .findFirst()
//                .get();
        System.out.println(point.getPoint());
//        System.out.println(point.getPoint());
    }
}
