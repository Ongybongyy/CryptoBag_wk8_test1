package au.edu.unsw.infs3634.cryptobag;

import au.edu.unsw.infs3634.cryptobag.Entities.CoinLoreResponse;
import retrofit2.http.GET;
import retrofit2.Call;

public interface CoinService {
    @GET("/api/tickers")
    Call<CoinLoreResponse>getCoins();
}
