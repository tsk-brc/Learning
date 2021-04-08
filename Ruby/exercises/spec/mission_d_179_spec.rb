require './app/mission_d_179.rb'

describe '余りチェック' do
  describe '出力結果のテスト' do
    let(:missionD179) { MissionD179.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "5\n", "17\n"
      expect($stdout).to receive(:puts).with(2)
      missionD179.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "2\n", "4\n"
      expect($stdout).to receive(:puts).with(0)
      missionD179.run
    end
  end
end
