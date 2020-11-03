require './app/mission_b_036.rb'

describe '大統領選挙チェック' do
  describe '出力結果のテスト' do

    let(:missionB036) { MissionB036.new }

    it 'テスト1' do
      allow(STDIN).to receive(:gets).and_return "5\n", 
        "Republican\n", 
        "Democratic\n", 
        "Republican\n", 
        "Democratic\n", 
        "Republican\n", 
        "7\n", 
        "1 2 3 4 5\n", 
        "1 4 3 2 5\n", 
        "4 5 1 3 2\n", 
        "5 3 2 1 4\n", 
        "3 4 1 2 5\n", 
        "4 2 1 3 5\n", 
        "4 3 1 5 2\n"
      expect(STDOUT).to receive(:puts).with(4)
      missionB036.run
    end

    it 'テスト2' do
      allow(STDIN).to receive(:gets).and_return "10\n", 
        "Republican\n", 
        "Republican\n", 
        "Democratic\n", 
        "Democratic\n", 
        "Democratic\n", 
        "Republican\n", 
        "Republican\n", 
        "Republican\n", 
        "Democratic\n", 
        "Republican\n", 
        "20\n", 
        "7 9 3 1 6 2 8 10 4 5\n", 
        "4 1 9 3 8 2 7 10 6 5\n", 
        "2 1 5 3 10 4 8 6 7 9\n", 
        "5 2 8 10 3 6 7 4 9 1\n", 
        "8 1 4 2 10 5 7 9 3 6\n", 
        "2 7 3 5 10 1 6 8 4 9\n", 
        "3 4 7 1 2 10 9 6 5 8\n", 
        "3 8 4 10 9 5 6 2 7 1\n", 
        "5 9 2 3 4 6 7 1 8 10\n", 
        "3 7 4 1 5 9 10 8 2 6\n", 
        "1 4 7 6 9 8 3 5 10 2\n", 
        "4 8 2 10 9 7 6 3 1 5\n", 
        "7 1 5 10 8 3 4 6 2 9\n", 
        "6 1 5 7 4 10 3 8 9 2\n", 
        "2 4 9 8 1 6 10 3 7 5\n", 
        "2 6 10 8 9 4 7 5 1 3\n", 
        "4 8 7 9 6 10 2 1 5 3\n", 
        "6 8 7 3 4 10 5 9 1 2\n", 
        "10 2 9 4 3 1 6 5 8 7\n", 
        "8 7 9 1 4 6 2 10 5 3\n"
      expect(STDOUT).to receive(:puts).with(4)
      missionB036.run
    end
  end
end