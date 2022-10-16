package com.g10.constants;

public interface GlobalConstant {
    int ORIGINAL_TILE_SIZE = 16;
    float SCALE = 3;

    int TILE_SIZE = (int) (ORIGINAL_TILE_SIZE * SCALE);
    int MAX_SCREEN_COL = 17;
    int MAX_SCREEN_ROW = 13;

    int MENU_TOP_ROW = 2;

    int MENU_TOP_HEIGHT = MENU_TOP_ROW * TILE_SIZE;
    int GAME_VIEWER_WIDTH = TILE_SIZE * MAX_SCREEN_COL;
    int GAME_VIEWER_HEIGHT = TILE_SIZE * MAX_SCREEN_ROW;
    int SCREEN_WIDTH = GAME_VIEWER_WIDTH;
    int SCREEN_HEIGHT = GAME_VIEWER_HEIGHT + MENU_TOP_ROW * TILE_SIZE;
}
