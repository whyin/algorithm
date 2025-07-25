class Solution {
    public int solution(int chicken) {
        int service = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            int newChicken = coupon / 10;
            int restCoupon = coupon % 10;
            service += newChicken;
            coupon = newChicken + restCoupon;
        }
        
        return service;
    }
}