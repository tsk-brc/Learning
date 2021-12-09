require './app/mission_d_197.rb'

describe 'ポイントチェック' do
  describe '出力結果のテスト' do
    let(:missionD197) { MissionD197.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "1200\n"
      expect($stdout).to receive(:puts).with(120)
      missionD197.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "999\n"
      expect($stdout).to receive(:puts).with(0)
      missionD197.run
    end
  end
end
